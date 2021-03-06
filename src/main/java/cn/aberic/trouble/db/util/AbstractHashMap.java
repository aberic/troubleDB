/*
 * MIT License
 *
 * Copyright (c) 2018 Aberic Yang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cn.aberic.trouble.db.util;

/**
 * @author Aberic on 2018/10/11 23:31
 * @see ClassLoader#defineClass(byte[], int, int)
 * @since 1.0
 */
abstract class AbstractHashMap<K, V> implements TMap<K, V> {

    /** 构造哈希表数组大小 */
    int hashArrayLength;
    /** B-Tree的最大值，如2层1度最大值3 */
    int treeMaxLength;

    /**
     * 返回此映射中的键-值映射关系数，并非强制重写。
     * 如果该映射包含的元素大于 <tt>Integer.MAX_VALUE</tt> ，则返回 <tt>Integer.MAX_VALUE</tt> 。
     *
     * <p>如果实现没有此接口需求，可放弃实现
     *
     * @return 此映射中的键-值映射关系数
     */
    int size(){
        return 0;
    }

    /**
     * 如果此映射未包含键-值映射关系，则返回 <tt>true</tt> ，并非强制重写。
     *
     * <p>如果实现没有此接口需求，可放弃实现
     *
     * @return 如果此映射未包含键-值映射关系，则返回 <tt>true</tt>
     */
    boolean isEmpty(){
        return true;
    }

    /**
     * 因为{@code #treeMaps}中每一个{@link TreeMemoryMap}的树规模及树叶子的对象都一样，
     * 所以当通过{@link #unit(int)}方法计算出要访问{@code #treeMaps}的数组下标后需要重新计算传入key在该数组中的hash值。
     *
     * @param hash 通过{@link #reHash(int)}方法处理过的hash值
     * @param unit 通过{@link #unit(int)}方法计算出要访问{@code #treeMaps}的数组下标
     * @return 真正执行存入操作的hash值
     */
    int storeHash(int hash, int unit) {
        return hash - unit * treeMaxLength;
    }

    /**
     * 根据传入key获取当前Hash数组中要访问的下标
     *
     * @param key key
     *
     * @return 当前Hash数组中要访问的下标
     */
    int unit(int key) {
        return --key / treeMaxLength;
    }

}

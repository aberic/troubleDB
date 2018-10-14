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

import cn.aberic.trouble.db.core.TDBConfig;

import java.io.Serializable;

/**
 * @author Aberic on 2018/10/14 20:39
 * @see ClassLoader#defineClass(byte[], int, int)
 * @since 1.0
 */
public class HashIndexMap<K, V> extends AbstractTMap<K, V> implements Serializable {

    private static final long serialVersionUID = 8138886090168482947L;

    private IndexTreeMap<K, V> indexTreeMap;

    public HashIndexMap(String name) {
        indexTreeMap = new IndexTreeMap<>(name);
        treeMaxLength = indexTreeMap.range().treeMaxLength;
    }

    public HashIndexMap(String name, TDBConfig config) {
        indexTreeMap = new IndexTreeMap<>(name, config);
        treeMaxLength = indexTreeMap.range().treeMaxLength;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }
}
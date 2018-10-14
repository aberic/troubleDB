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

package cn.aberic.trouble.db.core;

import cn.aberic.trouble.db.block.TroubleBlock;
import cn.aberic.trouble.db.util.HashBlockMap;
import cn.aberic.trouble.db.util.HashIndexMap;

/**
 * @author Aberic on 2018/10/12 14:38
 * @version 1.0
 * @see
 * @since 1.0
 */
public class TDBManager<V extends TroubleBlock> {

    private HashIndexMap<String, TDBTable<Integer, V>> blockMap;
    private HashIndexMap<String, TDITable> indexMap;
    private TDBConfig config;

    public TDBManager() {
        blockMap = new HashIndexMap<>("managerBlock");
        config = new TDBConfig();
    }

    public void createTable(String name) {
        blockMap.put(name, new TDBTable<>(name, config));
    }

    public boolean containsKey(String name, int key) {
        return blockMap.get(name).containsKey(key);
    }

    public V get(String name, int key) {
        return blockMap.get(name).get(key);
    }

    public V put(String name, int key, V value) {
        return blockMap.get(name).put(key, value);
    }

}

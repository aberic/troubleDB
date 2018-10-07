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

package cn.aberic.trouble.db;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 结点值对象
 * <p>
 * 结点{@link cn.aberic.trouble.db.NodeRange.Node}的值对象，保存其所指引的具体内容所在文件及所在文件中的位置
 *
 * @author Aberic on 2018/10/7 22:05
 * @see cn.aberic.trouble.db.NodeRange.Node
 * @see NodeRange
 * @since 1.0
 */
public class NodeValue {

    /** 区块所在区块文件编号 */
    @JSONField(name = "n")
    private int num;
    /** 区块所在区块文件中的行号 */
    @JSONField(name = "l")
    private int line;

    public NodeValue(int num, int line) {
        this.num = num;
        this.line = line;
    }

    public int getNum() {
        return num;
    }

    public int getLine() {
        return line;
    }
}

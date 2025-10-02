package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

/* loaded from: classes4.dex */
public final class SegmentedStringWriter extends Writer {
    public final TextBuffer d;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this.d = new TextBuffer(bufferRecycler);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        this.d.b(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.d.b(cArr, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        this.d.a(0, str.length(), str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        this.d.a(i, i2, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.d.a(0, string.length(), string);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        char c = (char) i;
        TextBuffer textBuffer = this.d;
        if (textBuffer.c >= 0) {
            textBuffer.r(16);
        }
        textBuffer.j = null;
        textBuffer.k = null;
        char[] cArr = textBuffer.h;
        if (textBuffer.i >= cArr.length) {
            textBuffer.i();
            cArr = textBuffer.h;
        }
        int i2 = textBuffer.i;
        textBuffer.i = i2 + 1;
        cArr[i2] = c;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        String string = charSequence.subSequence(i, i2).toString();
        this.d.a(0, string.length(), string);
        return this;
    }
}

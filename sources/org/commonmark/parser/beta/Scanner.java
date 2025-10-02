package org.commonmark.parser.beta;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.List;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.text.CharMatcher;

/* loaded from: classes8.dex */
public class Scanner {

    /* renamed from: a, reason: collision with root package name */
    public final List f26863a;
    public int b = 0;
    public int c = 0;
    public SourceLine d;
    public int e;

    public Scanner(List list) {
        this.d = new SourceLine("", null);
        this.e = 0;
        this.f26863a = list;
        if (list.isEmpty()) {
            return;
        }
        a(0, 0);
        SourceLine sourceLine = (SourceLine) list.get(0);
        this.d = sourceLine;
        this.e = sourceLine.f26860a.length();
    }

    public final void a(int i, int i2) {
        List list = this.f26863a;
        if (i < 0 || i >= list.size()) {
            throw new IllegalArgumentException(b.i(i, list.size(), "Line index ", " out of range, number of lines: "));
        }
        SourceLine sourceLine = (SourceLine) list.get(i);
        if (i2 < 0 || i2 > sourceLine.f26860a.length()) {
            throw new IllegalArgumentException(b.i(i2, sourceLine.f26860a.length(), "Index ", " out of range, line length: "));
        }
    }

    public final int b(char c) {
        int i = 0;
        while (true) {
            char cJ = j();
            if (cJ == 0) {
                return -1;
            }
            if (cJ == c) {
                return i;
            }
            i++;
            g();
        }
    }

    public final SourceLines c(Position position, Position position2) {
        int i = position.f26862a;
        int i2 = position.b;
        int i3 = position2.f26862a;
        int i4 = position2.b;
        List list = this.f26863a;
        if (i == i3) {
            SourceLine sourceLine = (SourceLine) list.get(i);
            CharSequence charSequenceSubSequence = sourceLine.f26860a.subSequence(i2, i4);
            SourceSpan sourceSpan = sourceLine.b;
            SourceLine sourceLine2 = new SourceLine(charSequenceSubSequence, sourceSpan != null ? sourceSpan.a(i2, i4) : null);
            SourceLines sourceLines = new SourceLines();
            sourceLines.f26861a.add(sourceLine2);
            return sourceLines;
        }
        SourceLines sourceLines2 = new SourceLines();
        SourceLine sourceLine3 = (SourceLine) list.get(i);
        SourceLine sourceLineA = sourceLine3.a(i2, sourceLine3.f26860a.length());
        ArrayList arrayList = sourceLines2.f26861a;
        arrayList.add(sourceLineA);
        while (true) {
            i++;
            if (i >= i3) {
                arrayList.add(((SourceLine) list.get(i3)).a(0, i4));
                return sourceLines2;
            }
            arrayList.add((SourceLine) list.get(i));
        }
    }

    public final boolean d() {
        return this.c < this.e || this.b < this.f26863a.size() - 1;
    }

    public final int e(CharMatcher charMatcher) {
        int i = 0;
        while (charMatcher.a(j())) {
            i++;
            g();
        }
        return i;
    }

    public final int f(char c) {
        int i = 0;
        while (j() == c) {
            i++;
            g();
        }
        return i;
    }

    public final void g() {
        int i = this.c + 1;
        this.c = i;
        if (i > this.e) {
            int i2 = this.b + 1;
            this.b = i2;
            List list = this.f26863a;
            if (i2 < list.size()) {
                SourceLine sourceLine = (SourceLine) list.get(this.b);
                this.d = sourceLine;
                this.e = sourceLine.f26860a.length();
            } else {
                SourceLine sourceLine2 = new SourceLine("", null);
                this.d = sourceLine2;
                this.e = sourceLine2.f26860a.length();
            }
            this.c = 0;
        }
    }

    public final boolean h(char c) {
        if (j() != c) {
            return false;
        }
        g();
        return true;
    }

    public final boolean i(String str) {
        int i = this.c;
        if (i < this.e && str.length() + i <= this.e) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (this.d.f26860a.charAt(this.c + i2) == str.charAt(i2)) {
                }
            }
            this.c = str.length() + this.c;
            return true;
        }
        return false;
    }

    public final char j() {
        int i = this.c;
        return i < this.e ? this.d.f26860a.charAt(i) : this.b < this.f26863a.size() + (-1) ? '\n' : (char) 0;
    }

    public final Position k() {
        return new Position(this.b, this.c);
    }

    public final void l(Position position) {
        int i = position.f26862a;
        int i2 = position.b;
        a(i, i2);
        this.b = i;
        this.c = i2;
        SourceLine sourceLine = (SourceLine) this.f26863a.get(i);
        this.d = sourceLine;
        this.e = sourceLine.f26860a.length();
    }

    public final int m() {
        int i = 0;
        while (true) {
            char cJ = j();
            if (cJ != ' ') {
                switch (cJ) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
            g();
        }
    }
}

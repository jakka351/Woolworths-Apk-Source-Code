package org.commonmark.internal;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.List;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterRun;

/* loaded from: classes8.dex */
public class Delimiter implements DelimiterRun {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26822a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public Delimiter f;
    public Delimiter g;

    public Delimiter(ArrayList arrayList, char c, boolean z, boolean z2, Delimiter delimiter) {
        this.f26822a = arrayList;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = delimiter;
        this.c = arrayList.size();
    }

    public final Text a() {
        return (Text) this.f26822a.get(0);
    }

    public final List b(int i) {
        ArrayList arrayList = this.f26822a;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException(b.i(arrayList.size(), i, "length must be between 1 and ", ", was "));
        }
        return arrayList.subList(0, i);
    }

    public final Text c() {
        return (Text) a.c(1, this.f26822a);
    }

    public final List d(int i) {
        ArrayList arrayList = this.f26822a;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException(b.i(arrayList.size(), i, "length must be between 1 and ", ", was "));
        }
        return arrayList.subList(arrayList.size() - i, arrayList.size());
    }
}

package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class Table {

    /* renamed from: a, reason: collision with root package name */
    public int f2719a;
    public ByteBuffer b;
    public int c;
    public int d;

    /* renamed from: androidx.emoji2.text.flatbuffer.Table$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<Integer> {
        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            throw null;
        }
    }

    public Table() {
        if (Utf8.f2720a == null) {
            Utf8.f2720a = new Utf8Safe();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}

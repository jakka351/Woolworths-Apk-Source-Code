package okio.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.RealBufferedSource;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Ref.ObjectRef e;
    public final /* synthetic */ RealBufferedSource f;
    public final /* synthetic */ Ref.ObjectRef g;
    public final /* synthetic */ Ref.ObjectRef h;

    public /* synthetic */ b(Ref.ObjectRef objectRef, RealBufferedSource realBufferedSource, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.e = objectRef;
        this.f = realBufferedSource;
        this.g = objectRef2;
        this.h = objectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.d;
        int iIntValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i) {
            case 0:
                long jLongValue = l.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    RealBufferedSource realBufferedSource = this.f;
                    byte b = realBufferedSource.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        this.e.d = Integer.valueOf(realBufferedSource.c());
                    }
                    if (z2) {
                        this.g.d = Integer.valueOf(realBufferedSource.c());
                    }
                    if (z3) {
                        this.h.d = Integer.valueOf(realBufferedSource.c());
                    }
                }
                return Unit.f24250a;
            default:
                long jLongValue2 = l.longValue();
                if (iIntValue == 1) {
                    Ref.ObjectRef objectRef = this.e;
                    if (objectRef.d != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    RealBufferedSource realBufferedSource2 = this.f;
                    objectRef.d = Long.valueOf(realBufferedSource2.d());
                    this.g.d = Long.valueOf(realBufferedSource2.d());
                    this.h.d = Long.valueOf(realBufferedSource2.d());
                }
                return Unit.f24250a;
        }
    }

    public /* synthetic */ b(RealBufferedSource realBufferedSource, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f = realBufferedSource;
        this.e = objectRef;
        this.g = objectRef2;
        this.h = objectRef3;
    }
}

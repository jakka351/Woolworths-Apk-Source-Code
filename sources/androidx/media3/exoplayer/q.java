package androidx.media3.exoplayer;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Supplier {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(((ExoPlayerImplInternal) this.e).H);
            default:
                return Boolean.valueOf(((AtomicBoolean) this.e).get());
        }
    }
}

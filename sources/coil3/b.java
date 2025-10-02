package coil3;

import coil3.decode.Decoder;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Decoder.Factory e;

    public /* synthetic */ b(Decoder.Factory factory, int i) {
        this.d = i;
        this.e = factory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
        }
        return CollectionsKt.Q(this.e);
    }
}

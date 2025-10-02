package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableKt;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", l = {225}, m = "toBitmap")
/* loaded from: classes2.dex */
final class LayerSnapshotV22$toBitmap$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ LayerSnapshotV22 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = layerSnapshotV22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        this.p = obj;
        int i = this.r | Integer.MIN_VALUE;
        this.r = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            layerSnapshotV22$toBitmap$1 = this;
        } else {
            layerSnapshotV22$toBitmap$1 = new LayerSnapshotV22$toBitmap$1(this.q, this);
        }
        Object obj2 = layerSnapshotV22$toBitmap$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = layerSnapshotV22$toBitmap$1.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.b(obj2);
            Bitmap bitmapA = LayerSnapshot_androidKt.a((Image) obj2);
            AutoCloseableKt.a(null, null);
            return bitmapA;
        } finally {
        }
    }
}

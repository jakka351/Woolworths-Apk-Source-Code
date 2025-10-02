package au.com.woolworths.feature.shop.voc.score;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor", f = "VocDeviceInfoInteractor.kt", l = {42}, m = "getDeviceInfo")
/* loaded from: classes3.dex */
final class VocDeviceInfoInteractor$getDeviceInfo$1 extends ContinuationImpl {
    public VocDeviceInfoInteractor A;
    public /* synthetic */ Object B;
    public final /* synthetic */ VocDeviceInfoInteractor C;
    public int D;
    public Optional p;
    public Optional q;
    public Optional r;
    public Optional s;
    public Optional t;
    public Optional u;
    public Optional v;
    public Optional w;
    public Optional x;
    public Optional y;
    public Optional z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocDeviceInfoInteractor$getDeviceInfo$1(VocDeviceInfoInteractor vocDeviceInfoInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.C = vocDeviceInfoInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}

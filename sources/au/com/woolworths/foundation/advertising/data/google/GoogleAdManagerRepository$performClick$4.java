package au.com.woolworths.foundation.advertising.data.google;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$performClick$4", f = "GoogleAdManagerRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleAdManagerRepository$performClick$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ GoogleAdManagerRepository p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Map s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerRepository$performClick$4(GoogleAdManagerRepository googleAdManagerRepository, String str, String str2, Map map, Continuation continuation) {
        super(2, continuation);
        this.p = googleAdManagerRepository;
        this.q = str;
        this.r = str2;
        this.s = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleAdManagerRepository$performClick$4(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerRepository$performClick$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        NativeCustomFormatAd nativeCustomFormatAd = this.p.f.get(new CacheKey(this.q, this.r, this.s));
        if (nativeCustomFormatAd == null) {
            return null;
        }
        nativeCustomFormatAd.performClick("imageUrl");
        return Unit.f24250a;
    }
}

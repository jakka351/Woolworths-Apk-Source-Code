package io.branch.coroutines;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import io.branch.referral.BranchLogger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u0001*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.AdvertisingIdsKt$getAmazonFireAdvertisingInfoObject$2", f = "AdvertisingIds.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AdvertisingIdsKt$getAmazonFireAdvertisingInfoObject$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Integer, ? extends String>>, Object> {
    public final /* synthetic */ Context p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisingIdsKt$getAmazonFireAdvertisingInfoObject$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.p = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertisingIdsKt$getAmazonFireAdvertisingInfoObject$2(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertisingIdsKt$getAmazonFireAdvertisingInfoObject$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            ContentResolver contentResolver = this.p.getContentResolver();
            return new Pair(new Integer(Settings.Secure.getInt(contentResolver, "limit_ad_tracking")), Settings.Secure.getString(contentResolver, "advertising_id"));
        } catch (Exception e) {
            BranchLogger.f("Caught getAmazonFireAdvertisingInfo exception: " + e);
            return null;
        }
    }
}

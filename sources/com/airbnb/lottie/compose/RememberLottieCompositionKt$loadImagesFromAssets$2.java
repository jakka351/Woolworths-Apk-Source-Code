package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RememberLottieCompositionKt$loadImagesFromAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LottieComposition p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadImagesFromAssets$2(LottieComposition lottieComposition, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.p = lottieComposition;
        this.q = context;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$loadImagesFromAssets$2(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        RememberLottieCompositionKt$loadImagesFromAssets$2 rememberLottieCompositionKt$loadImagesFromAssets$2 = (RememberLottieCompositionKt$loadImagesFromAssets$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rememberLottieCompositionKt$loadImagesFromAssets$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        for (LottieImageAsset lottieImageAsset : ((HashMap) this.p.c()).values()) {
            Intrinsics.e(lottieImageAsset);
            String str2 = lottieImageAsset.d;
            if (lottieImageAsset.f == null && StringsKt.W(str2, "data:", false) && StringsKt.C(str2, "base64,", 0, false, 6) > 0) {
                try {
                    String strSubstring = str2.substring(StringsKt.B(str2, ',', 0, 6) + 1);
                    Intrinsics.g(strSubstring, "substring(...)");
                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    lottieImageAsset.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e) {
                    Logger.c("data URL did not have correct base64 format.", e);
                }
            }
            Context context = this.q;
            if (lottieImageAsset.f == null && (str = this.r) != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str + str2);
                    Intrinsics.e(inputStreamOpen);
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        lottieImageAsset.f = Utils.d(BitmapFactory.decodeStream(inputStreamOpen, null, options2), lottieImageAsset.f13345a, lottieImageAsset.b);
                    } catch (IllegalArgumentException e2) {
                        Logger.c("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    Logger.c("Unable to open asset.", e3);
                }
            }
        }
        return Unit.f24250a;
    }
}

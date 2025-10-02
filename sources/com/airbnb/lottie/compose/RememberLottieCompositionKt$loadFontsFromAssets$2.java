package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Typeface;
import androidx.camera.core.impl.b;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
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
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RememberLottieCompositionKt$loadFontsFromAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LottieComposition p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadFontsFromAssets$2(LottieComposition lottieComposition, Context context, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.p = lottieComposition;
        this.q = context;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$loadFontsFromAssets$2(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RememberLottieCompositionKt$loadFontsFromAssets$2 rememberLottieCompositionKt$loadFontsFromAssets$2 = (RememberLottieCompositionKt$loadFontsFromAssets$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rememberLottieCompositionKt$loadFontsFromAssets$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        for (Font font : this.p.f.values()) {
            Context context = this.q;
            Intrinsics.e(font);
            String str = font.f13391a;
            String str2 = font.c;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), b.o(this.r, str, this.s));
                try {
                    Intrinsics.e(typefaceCreateFromAsset);
                    Intrinsics.g(str2, "getStyle(...)");
                    int i = 0;
                    boolean zO = StringsKt.o(str2, "Italic", false);
                    boolean zO2 = StringsKt.o(str2, "Bold", false);
                    if (zO && zO2) {
                        i = 3;
                    } else if (zO) {
                        i = 2;
                    } else if (zO2) {
                        i = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    font.d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    Logger.f13477a.getClass();
                }
            } catch (Exception unused2) {
                Logger.f13477a.getClass();
            }
        }
        return Unit.f24250a;
    }
}

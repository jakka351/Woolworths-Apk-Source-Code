package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperty;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LottieDynamicProperty<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13381a;
    public final KeyPath b;
    public final Function1 c;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.LottieDynamicProperty$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<LottieFrameInfo<Object>, Object> {
        public final /* synthetic */ Object h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj) {
            super(1);
            this.h = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            LottieFrameInfo it = (LottieFrameInfo) obj;
            Intrinsics.h(it, "it");
            return this.h;
        }
    }

    public LottieDynamicProperty(Object obj, KeyPath keyPath, Object obj2) {
        Intrinsics.h(keyPath, "keyPath");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2);
        this.f13381a = obj;
        this.b = keyPath;
        this.c = anonymousClass1;
    }
}

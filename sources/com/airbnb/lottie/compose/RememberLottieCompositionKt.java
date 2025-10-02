package com.airbnb.lottie.compose;

import YU.a;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.e;
import com.airbnb.lottie.h;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.jsonwebtoken.Header;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", lqlqqlq.m006Dm006Dm006Dm, "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RememberLottieCompositionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r14, com.airbnb.lottie.compose.LottieCompositionSpec r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.a(android.content.Context, com.airbnb.lottie.compose.LottieCompositionSpec, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final LottieTask b(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z) throws FileNotFoundException {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            if (!Intrinsics.c(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.e(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).f13378a, str);
            }
            int i = ((LottieCompositionSpec.RawRes) lottieCompositionSpec).f13378a;
            return LottieCompositionFactory.e(context, i, LottieCompositionFactory.k(i, context));
        }
        int i2 = 0;
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            if (!Intrinsics.c(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.a(str, new e(((LottieCompositionSpec.Url) lottieCompositionSpec).f13379a, str, context, i2), null);
            }
            String str2 = ((LottieCompositionSpec.Url) lottieCompositionSpec).f13379a;
            HashMap map = LottieCompositionFactory.f13343a;
            String strA = a.A("url_", str2);
            return LottieCompositionFactory.a(strA, new e(str2, strA, context, i2), null);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z) {
                return null;
            }
            new FileInputStream((String) null);
            Intrinsics.c(str, "__LottieInternalDefaultCacheKey__");
            StringsKt.v(null, Header.COMPRESSION_ALGORITHM, false);
            throw null;
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            int i3 = 1;
            if (!Intrinsics.c(str, "__LottieInternalDefaultCacheKey__")) {
                String str3 = ((LottieCompositionSpec.Asset) lottieCompositionSpec).f13377a;
                HashMap map2 = LottieCompositionFactory.f13343a;
                return LottieCompositionFactory.a(str, new e(str3, str, context.getApplicationContext(), i3), null);
            }
            String str4 = ((LottieCompositionSpec.Asset) lottieCompositionSpec).f13377a;
            HashMap map3 = LottieCompositionFactory.f13343a;
            String strConcat = "asset_".concat(str4);
            return LottieCompositionFactory.a(strConcat, new e(str4, strConcat, context.getApplicationContext(), i3), null);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.c(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            return LottieCompositionFactory.a(str, new h(), null);
        }
        if (!(lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider)) {
            throw new NoWhenBranchMatchedException();
        }
        context.getContentResolver().openInputStream(null);
        if (Intrinsics.c(str, "__LottieInternalDefaultCacheKey__")) {
            throw null;
        }
        throw null;
    }

    public static final LottieCompositionResultImpl c(LottieCompositionSpec lottieCompositionSpec, Composer composer, int i) {
        composer.F(-1248473602);
        RememberLottieCompositionKt$rememberLottieComposition$1 rememberLottieCompositionKt$rememberLottieComposition$1 = new RememberLottieCompositionKt$rememberLottieComposition$1(3, null);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        composer.F(1388713922);
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && composer.n(lottieCompositionSpec)) || (i & 6) == 4;
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (z || objG == composer$Companion$Empty$1) {
            objG = SnapshotStateKt.f(new LottieCompositionResultImpl());
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        composer.N();
        composer.F(1388714213);
        boolean z2 = ((i2 > 4 && composer.n(lottieCompositionSpec)) || (i & 6) == 4) | ((((57344 & i) ^ 24576) > 16384 && composer.n("__LottieInternalDefaultCacheKey__")) || (i & 24576) == 16384);
        Object objG2 = composer.G();
        if (z2 || objG2 == composer$Companion$Empty$1) {
            objG2 = b(context, lottieCompositionSpec, "__LottieInternalDefaultCacheKey__", true);
            composer.A(objG2);
        }
        composer.N();
        EffectsKt.f(lottieCompositionSpec, "__LottieInternalDefaultCacheKey__", new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, lottieCompositionSpec, mutableState, null), composer);
        LottieCompositionResultImpl lottieCompositionResultImpl = (LottieCompositionResultImpl) mutableState.getD();
        composer.N();
        return lottieCompositionResultImpl;
    }
}

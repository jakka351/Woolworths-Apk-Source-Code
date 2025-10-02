package au.com.woolworths.feature.shop.contentpage.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageHeaderData;
import au.com.woolworths.feature.shop.contentpage.data.GenericPageHeroImageType;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageHeaderKt {
    public static final void a(ContentPageHeaderData header, Function1 onVideoPlayClick, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(header, "header");
        GenericPageHeroImageType genericPageHeroImageType = header.c;
        VideoData videoData = header.d;
        Intrinsics.h(onVideoPlayClick, "onVideoPlayClick");
        ComposerImpl composerImplV = composer.v(-981184618);
        int i2 = i | (composerImplV.n(header) ? 4 : 2) | (composerImplV.I(onVideoPlayClick) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1974394742);
            String strB = videoData == null ? null : StringResources_androidKt.b(R.string.video_title_suffix_content_description, new Object[]{videoData.getTitle()}, composerImplV);
            composerImplV.V(false);
            boolean z = videoData != null;
            composerImplV.o(-1746271574);
            boolean zN = ((i2 & 112) == 32) | composerImplV.n(strB) | composerImplV.I(videoData);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new androidx.lifecycle.compose.b(strB, onVideoPlayClick, videoData, 14);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = ConditionalModifierKt.b(companion, z, (Function1) objG, null, 4);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            String thumbnail = header.b;
            if (thumbnail == null) {
                thumbnail = videoData != null ? videoData.getThumbnail() : null;
            }
            builder.c = thumbnail;
            ImageRequests_androidKt.d(builder, R.drawable.ic_image_placeholder);
            ImageRequests_androidKt.a(builder, R.drawable.ic_image_placeholder);
            builder.j = CachePolicy.f;
            ImageRequest imageRequestA = builder.a();
            String title = videoData != null ? videoData.getTitle() : null;
            composerImplV.o(-1075139576);
            String strB2 = title == null ? null : StringResources_androidKt.b(R.string.video_title_suffix_content_description, new Object[]{title}, composerImplV);
            composerImplV.V(false);
            GenericPageHeroImageType genericPageHeroImageType2 = GenericPageHeroImageType.d;
            ContentScale contentScale = genericPageHeroImageType == genericPageHeroImageType2 ? ContentScale.Companion.f1880a : ContentScale.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            boolean z2 = genericPageHeroImageType == genericPageHeroImageType2;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(20);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            ContentScale contentScale2 = contentScale;
            composerImpl = composerImplV;
            SingletonAsyncImageKt.a(imageRequestA, strB2, TestTagKt.a(ConditionalModifierKt.b(modifierE, z2, (Function1) objG2, null, 4), "hero image"), null, contentScale2, composerImpl, 0, 1976);
            composerImpl.o(-1075117211);
            if (videoData != null) {
                ImageKt.b(VectorResources_androidKt.b(R.drawable.ic_video_play_control, 6, composerImpl), TestTagKt.a(BackgroundKt.b(BoxScopeInstance.f944a.g(companion, Alignment.Companion.e), Color.b(Color.b, 0.6f), RoundedCornerShapeKt.f1100a), "video play cta"), null, composerImpl, 48, 120);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(header, onVideoPlayClick, modifier2, i, 17);
        }
    }
}

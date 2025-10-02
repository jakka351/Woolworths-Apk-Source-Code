package coil3.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.SingletonImageLoader;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SingletonAsyncImageKt {
    public static final void a(Object obj, String str, Modifier modifier, BiasAlignment biasAlignment, ContentScale contentScale, Composer composer, int i, int i2) {
        int i3 = i << 3;
        int i4 = (i & 126) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        AsyncImageKt.a(UtilsKt.a(obj, SingletonImageLoader.a((Context) composer.x(AndroidCompositionLocals_androidKt.b)), composer), str, modifier, AsyncImagePainter.y, null, (i2 & 32) != 0 ? Alignment.Companion.e : biasAlignment, (i2 & 64) != 0 ? ContentScale.Companion.b : contentScale, null, composer, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static final void b(Object obj, String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, BiasAlignment biasAlignment, ContentScale contentScale, BlendModeColorFilter blendModeColorFilter, Composer composer, int i, int i2, int i3) {
        BlendModeColorFilter blendModeColorFilter2;
        Function1 aVar;
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.d : modifier;
        Painter painter4 = (i3 & 8) != 0 ? null : painter;
        Painter painter5 = (i3 & 16) != 0 ? null : painter2;
        Painter painter6 = (i3 & 32) != 0 ? painter5 : painter3;
        Function1 function14 = (i3 & 64) != 0 ? null : function1;
        Function1 function15 = (i3 & 128) != 0 ? null : function12;
        Function1 function16 = (i3 & 256) != 0 ? null : function13;
        BiasAlignment biasAlignment2 = (i3 & 512) != 0 ? Alignment.Companion.e : biasAlignment;
        ContentScale contentScale2 = (i3 & 1024) != 0 ? ContentScale.Companion.b : contentScale;
        BlendModeColorFilter blendModeColorFilter3 = (i3 & 4096) != 0 ? null : blendModeColorFilter;
        int i4 = i << 3;
        int i5 = (i & 126) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        int i6 = i2 << 3;
        int i7 = (i6 & 458752) | ((i >> 27) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344);
        int i8 = i5 >> 3;
        AsyncImageState asyncImageStateA = UtilsKt.a(obj, SingletonImageLoader.a((Context) composer.x(AndroidCompositionLocals_androidKt.b)), composer);
        if (painter4 == null && painter5 == null && painter6 == null) {
            aVar = AsyncImagePainter.y;
            blendModeColorFilter2 = blendModeColorFilter3;
        } else {
            blendModeColorFilter2 = blendModeColorFilter3;
            aVar = new au.com.woolworths.android.onesite.di.a(1, painter4, painter6, painter5);
        }
        au.com.woolworths.android.onesite.di.a aVar2 = (function14 == null && function15 == null && function16 == null) ? null : new au.com.woolworths.android.onesite.di.a(2, function14, function15, function16);
        int i9 = i7 << 15;
        AsyncImageKt.a(asyncImageStateA, str, modifier2, aVar, aVar2, biasAlignment2, contentScale2, blendModeColorFilter2, composer, (i5 & 112) | (i8 & 896) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i7 >> 15) & 14);
    }
}

package androidx.navigation.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.navigation.NavBackStackEntry;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WebViewAppInterface;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$VideoAdPlayer$playerListener$1$1;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.BackgroundOverlayPosition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listSubList;
        switch (this.d) {
            case 0:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                Ref.IntRef intRef = (Ref.IntRef) this.g;
                NavControllerImpl navControllerImpl = (NavControllerImpl) this.h;
                Bundle bundle = (Bundle) this.i;
                NavBackStackEntry entry = (NavBackStackEntry) obj;
                Intrinsics.h(entry, "entry");
                booleanRef.d = true;
                int iIndexOf = arrayList.indexOf(entry);
                if (iIndexOf != -1) {
                    int i = iIndexOf + 1;
                    listSubList = arrayList.subList(intRef.d, i);
                    intRef.d = i;
                } else {
                    listSubList = EmptyList.d;
                }
                navControllerImpl.a(entry.e, bundle, entry, listSubList);
                break;
            case 1:
                Function1 function1 = (Function1) this.e;
                PaymentMethodItem.CreditCard.Linked linked = (PaymentMethodItem.CreditCard.Linked) this.f;
                Map<String, String> map = (Map) this.g;
                Function2 function2 = (Function2) this.h;
                MutableState mutableState = (MutableState) this.i;
                WebView it = (WebView) obj;
                Intrinsics.h(it, "it");
                it.addJavascriptInterface(new WebViewAppInterface(new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(18, function2, linked)), "appInterface");
                it.loadUrl(linked.getCvvUrl(), map);
                mutableState.setValue(it);
                function1.invoke(it);
                break;
            case 2:
                final Function1 function12 = (Function1) this.e;
                final ExoPlayer exoPlayer = (ExoPlayer) this.f;
                final VideoAdPlayerKt$VideoAdPlayer$playerListener$1$1 videoAdPlayerKt$VideoAdPlayer$playerListener$1$1 = (VideoAdPlayerKt$VideoAdPlayer$playerListener$1$1) this.g;
                final Ref.ObjectRef objectRef = (Ref.ObjectRef) this.h;
                final MutableState mutableState2 = (MutableState) this.i;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$VideoAdPlayer$lambda$10$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        VideoAdPlayerState videoAdPlayerState = (VideoAdPlayerState) mutableState2.getD();
                        ExoPlayer exoPlayer2 = exoPlayer;
                        function12.invoke(VideoAdPlayerState.a(videoAdPlayerState, false, false, exoPlayer2.getCurrentPosition(), false, false, BitmapDescriptorFactory.HUE_RED, 59));
                        exoPlayer2.G(videoAdPlayerKt$VideoAdPlayer$playerListener$1$1);
                        exoPlayer2.release();
                        SimpleCache simpleCache = SimpleCacheProvider.f8891a;
                        if (simpleCache != null) {
                            simpleCache.p();
                        }
                        SimpleCacheProvider.f8891a = null;
                        SimpleCacheProvider.b = null;
                        Ref.ObjectRef objectRef2 = objectRef;
                        Bitmap bitmap = (Bitmap) objectRef2.d;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        objectRef2.d = null;
                    }
                };
            default:
                BackgroundOverlayPosition backgroundOverlayPosition = (BackgroundOverlayPosition) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                ArrayList arrayList3 = (ArrayList) this.g;
                ArrayList arrayList4 = (ArrayList) this.h;
                TopAppBarScrollBehavior topAppBarScrollBehavior = (TopAppBarScrollBehavior) this.i;
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                int iOrdinal = backgroundOverlayPosition.ordinal();
                if (iOrdinal == 0) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        layout.e((Placeable) it2.next(), 0, MathKt.b(topAppBarScrollBehavior.getF1443a().b()), BitmapDescriptorFactory.HUE_RED);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Placeable.PlacementScope.g(layout, (Placeable) it3.next(), 0L);
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        Placeable.PlacementScope.g(layout, (Placeable) it4.next(), 0L);
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        Placeable.PlacementScope.g(layout, (Placeable) it5.next(), 0L);
                    }
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        Placeable.PlacementScope.g(layout, (Placeable) it6.next(), 0L);
                    }
                    Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        layout.e((Placeable) it7.next(), 0, MathKt.b(topAppBarScrollBehavior.getF1443a().b()), BitmapDescriptorFactory.HUE_RED);
                    }
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }
}

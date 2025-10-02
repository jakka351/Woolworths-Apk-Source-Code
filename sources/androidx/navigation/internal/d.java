package androidx.navigation.internal;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.navigation.NavBackStackEntry;
import au.com.woolworths.shop.aem.components.ui.video.VideoUiKt$VideoUi$playerListener$2$1$1;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d(Context context, ExoPlayer exoPlayer, boolean z, Lazy lazy, Function1 function1) {
        this.f = context;
        this.g = exoPlayer;
        this.e = z;
        this.h = lazy;
        this.i = function1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f;
                Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) this.g;
                NavControllerImpl navControllerImpl = (NavControllerImpl) this.h;
                ArrayDeque arrayDeque = (ArrayDeque) this.i;
                NavBackStackEntry entry = (NavBackStackEntry) obj;
                Intrinsics.h(entry, "entry");
                booleanRef.d = true;
                booleanRef2.d = true;
                navControllerImpl.m(entry, this.e, arrayDeque);
                return Unit.f24250a;
            case 1:
                Context context = (Context) this.f;
                ExoPlayer exoPlayer = (ExoPlayer) this.g;
                Lazy lazy = (Lazy) this.h;
                Function1 function1 = (Function1) this.i;
                Context it = (Context) obj;
                Intrinsics.h(it, "it");
                PlayerView playerView = new PlayerView(context);
                playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                playerView.setResizeMode(0);
                playerView.setPlayer(exoPlayer);
                boolean z = this.e;
                if (z) {
                    playerView.setControllerShowTimeoutMs(0);
                    playerView.h(playerView.g());
                    exoPlayer.J();
                }
                playerView.setControllerAutoShow(z);
                playerView.setControllerHideOnTouch(!z);
                exoPlayer.H((VideoUiKt$VideoUi$playerListener$2$1$1) lazy.getD());
                playerView.setControllerVisibilityListener(new androidx.camera.lifecycle.b(7, function1));
                return playerView;
            default:
                String str = (String) this.f;
                String str2 = (String) this.g;
                String str3 = (String) this.h;
                String str4 = (String) this.i;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case 101661:
                        if (lowerCase.equals("fri")) {
                            str = "Friday";
                            break;
                        }
                        break;
                    case 108300:
                        if (lowerCase.equals("mon")) {
                            str = "Monday";
                            break;
                        }
                        break;
                    case 113638:
                        if (lowerCase.equals("sat")) {
                            str = "Saturday";
                            break;
                        }
                        break;
                    case 114252:
                        if (lowerCase.equals("sun")) {
                            str = "Sunday";
                            break;
                        }
                        break;
                    case 114817:
                        if (lowerCase.equals("thu")) {
                            str = "Thursday";
                            break;
                        }
                        break;
                    case 115204:
                        if (lowerCase.equals("tue")) {
                            str = "Tuesday";
                            break;
                        }
                        break;
                    case 117590:
                        if (lowerCase.equals("wed")) {
                            str = "Wednesday";
                            break;
                        }
                        break;
                }
                String str5 = this.e ? "selected" : "not selected";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                sb.append(", ");
                sb.append(str3);
                SemanticsPropertiesKt.k(semantics, androidx.constraintlayout.core.state.a.l(sb, ", ", str4, ", ", str5));
                return Unit.f24250a;
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, boolean z) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.e = z;
    }

    public /* synthetic */ d(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, NavControllerImpl navControllerImpl, boolean z, ArrayDeque arrayDeque) {
        this.f = booleanRef;
        this.g = booleanRef2;
        this.h = navControllerImpl;
        this.e = z;
        this.i = arrayDeque;
    }
}

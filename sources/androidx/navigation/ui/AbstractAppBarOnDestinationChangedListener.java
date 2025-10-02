package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavArgument;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavType;
import androidx.navigation.NavType$Companion$ReferenceType$1;
import androidx.navigation.internal.NavControllerImpl;
import androidx.os.SavedStateReader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class AbstractAppBarOnDestinationChangedListener implements NavController.OnDestinationChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3518a;
    public final AppBarConfiguration b;
    public final WeakReference c = null;
    public DrawerArrowDrawable d;
    public ObjectAnimator e;

    public AbstractAppBarOnDestinationChangedListener(Context context, AppBarConfiguration appBarConfiguration) {
        this.f3518a = context;
        this.b = appBarConfiguration;
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void a(NavController navController, NavDestination destination, Bundle bundle) {
        String string;
        String strValueOf;
        boolean z;
        Pair pair;
        Intrinsics.h(destination, "destination");
        if (destination instanceof FloatingWindow) {
            return;
        }
        WeakReference weakReference = this.c;
        Openable openable = weakReference != null ? (Openable) weakReference.get() : null;
        if (weakReference != null && openable == null) {
            NavControllerImpl navControllerImpl = navController.b;
            navControllerImpl.getClass();
            navControllerImpl.q.remove(this);
            return;
        }
        CharSequence charSequence = destination.g;
        Context context = this.f3518a;
        if (charSequence == null) {
            string = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            Map mapN = bundle != null ? SavedStateReader.n(bundle) : EmptyMap.d;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup == null || !mapN.containsKey(strGroup)) {
                    throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
                }
                matcher.appendReplacement(stringBuffer, "");
                NavArgument navArgument = (NavArgument) destination.i().get(strGroup);
                NavType navType = navArgument != null ? navArgument.f3472a : null;
                NavType$Companion$ReferenceType$1 navType$Companion$ReferenceType$1 = NavType.c;
                if (Intrinsics.c(navType, navType$Companion$ReferenceType$1)) {
                    Intrinsics.e(bundle);
                    strValueOf = context.getString(((Integer) navType$Companion$ReferenceType$1.a(bundle, strGroup)).intValue());
                } else {
                    Intrinsics.e(navType);
                    Intrinsics.e(bundle);
                    strValueOf = String.valueOf(navType.a(bundle, strGroup));
                }
                Intrinsics.e(strValueOf);
                stringBuffer.append(strValueOf);
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        if (string != null) {
            c(string);
        }
        AppBarConfiguration appBarConfiguration = this.b;
        appBarConfiguration.getClass();
        Intrinsics.h(destination, "destination");
        int i = NavDestination.i;
        for (NavDestination navDestination : NavDestination.Companion.b(destination)) {
            if (appBarConfiguration.f3519a.contains(Integer.valueOf(navDestination.e.e))) {
                if (navDestination instanceof NavGraph) {
                    int i2 = destination.e.e;
                    int i3 = NavGraph.k;
                    if (i2 == ((NavDestination) SequencesKt.q(SequencesKt.m((NavGraph) navDestination, new androidx.navigation.a(6)))).e.e) {
                    }
                }
                z = true;
                break;
            }
        }
        z = false;
        if (openable == null && z) {
            b(null, 0);
            return;
        }
        boolean z2 = openable != null && z;
        DrawerArrowDrawable drawerArrowDrawable = this.d;
        if (drawerArrowDrawable != null) {
            pair = new Pair(drawerArrowDrawable, Boolean.TRUE);
        } else {
            DrawerArrowDrawable drawerArrowDrawable2 = new DrawerArrowDrawable(context);
            this.d = drawerArrowDrawable2;
            pair = new Pair(drawerArrowDrawable2, Boolean.FALSE);
        }
        DrawerArrowDrawable drawerArrowDrawable3 = (DrawerArrowDrawable) pair.d;
        boolean zBooleanValue = ((Boolean) pair.e).booleanValue();
        b(drawerArrowDrawable3, z2 ? com.woolworths.R.string.nav_app_bar_open_drawer_description : com.woolworths.R.string.nav_app_bar_navigate_up_description);
        float f = z2 ? BitmapDescriptorFactory.HUE_RED : 1.0f;
        if (!zBooleanValue) {
            drawerArrowDrawable3.setProgress(f);
            return;
        }
        float f2 = drawerArrowDrawable3.j;
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(drawerArrowDrawable3, "progress", f2, f);
        this.e = objectAnimatorOfFloat;
        Intrinsics.f(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    public abstract void b(DrawerArrowDrawable drawerArrowDrawable, int i);

    public abstract void c(String str);
}

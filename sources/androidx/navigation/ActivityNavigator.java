package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavDestinationImpl;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Navigator.Name("activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Destination", "Extras", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class ActivityNavigator extends Navigator<Destination> {
    public final Context c;
    public final Activity d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "", "EXTRA_NAV_SOURCE", "Ljava/lang/String;", "EXTRA_NAV_CURRENT", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @NavDestination.ClassType
    @SourceDebugExtension
    public static class Destination extends NavDestination {
        public Intent j;
        public String k;

        public static String n(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            Intrinsics.g(packageName, "getPackageName(...)");
            return StringsKt.Q(str, "${applicationId}", packageName, false);
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Destination) && super.equals(obj)) {
                Intent intent = this.j;
                if ((intent != null ? intent.filterEquals(((Destination) obj).j) : ((Destination) obj).j == null) && Intrinsics.c(this.k, ((Destination) obj).k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.j;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.k;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        public final void k(Context context, AttributeSet attributeSet) {
            super.k(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.f3493a);
            Intrinsics.g(typedArrayObtainAttributes, "obtainAttributes(...)");
            String strN = n(context, typedArrayObtainAttributes.getString(4));
            if (this.j == null) {
                this.j = new Intent();
            }
            Intent intent = this.j;
            Intrinsics.e(intent);
            intent.setPackage(strN);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                ComponentName componentName = new ComponentName(context, string);
                if (this.j == null) {
                    this.j = new Intent();
                }
                Intent intent2 = this.j;
                Intrinsics.e(intent2);
                intent2.setComponent(componentName);
            }
            String string2 = typedArrayObtainAttributes.getString(1);
            if (this.j == null) {
                this.j = new Intent();
            }
            Intent intent3 = this.j;
            Intrinsics.e(intent3);
            intent3.setAction(string2);
            String strN2 = n(context, typedArrayObtainAttributes.getString(2));
            if (strN2 != null) {
                Uri uri = Uri.parse(strN2);
                if (this.j == null) {
                    this.j = new Intent();
                }
                Intent intent4 = this.j;
                Intrinsics.e(intent4);
                intent4.setData(uri);
            }
            this.k = n(context, typedArrayObtainAttributes.getString(3));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            Intent intent = this.j;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.j;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "Builder", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
        }
    }

    public ActivityNavigator(@NotNull Context context) {
        Object next;
        Intrinsics.h(context, "context");
        this.c = context;
        Iterator f24664a = SequencesKt.m(context, new a(0)).getF24664a();
        while (true) {
            if (!f24664a.hasNext()) {
                next = null;
                break;
            } else {
                next = f24664a.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        Intent intent;
        int intExtra;
        Destination destination = (Destination) navDestination;
        NavDestinationImpl navDestinationImpl = destination.e;
        if (destination.j == null) {
            throw new IllegalStateException(YU.a.m(new StringBuilder("Destination "), navDestinationImpl.e, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.j);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = destination.k;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.e(strGroup);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    NavArgument navArgument = (NavArgument) destination.i().get(strGroup);
                    NavType navType = navArgument != null ? navArgument.f3472a : null;
                    stringBuffer.append(navType != null ? navType.f(navType.a(bundle, strGroup)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.f3486a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", navDestinationImpl.e);
        Context context = this.c;
        Resources resources = context.getResources();
        if (navOptions != null) {
            int i = navOptions.h;
            int i2 = navOptions.i;
            if ((i <= 0 || !Intrinsics.c(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !Intrinsics.c(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                Intrinsics.e(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2));
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + destination);
            }
        }
        context.startActivity(intent2);
        if (navOptions != null && activity != null) {
            int i3 = navOptions.f;
            int i4 = navOptions.g;
            if ((i3 > 0 && Intrinsics.c(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && Intrinsics.c(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + destination);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // androidx.navigation.Navigator
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

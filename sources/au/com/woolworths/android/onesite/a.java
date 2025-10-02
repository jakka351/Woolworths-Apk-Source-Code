package au.com.woolworths.android.onesite;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.icon.CoreIcons;
import com.apollographql.apollo.api.CompiledArgument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void A(StringBuilder sb, String str, String str2, Boolean bool, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(bool);
        sb.append(str3);
    }

    public static void B(StringBuilder sb, String str, String str2, List list, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void C(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    public static void D(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static int a(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static SparseArray b(int i, int i2, int i3, String str, String str2) {
        SparseArray sparseArray = new SparseArray(i);
        sparseArray.put(i2, str);
        sparseArray.put(i3, str2);
        return sparseArray;
    }

    public static CoreIcons c(Number number, Composer composer, int i, Composer composer2) {
        number.intValue();
        composer.o(i);
        return CoreTheme.e(composer2);
    }

    public static Object d(int i, ComposerImpl composerImpl, boolean z) {
        composerImpl.V(z);
        composerImpl.o(i);
        return composerImpl.G();
    }

    public static Object e(Composer composer, int i) {
        composer.l();
        composer.o(i);
        return composer.G();
    }

    public static Object f(ComposerImpl composerImpl, Modifier modifier, Function2 function2, int i) {
        Updater.b(composerImpl, modifier, function2);
        composerImpl.o(i);
        return composerImpl.G();
    }

    public static String g(Context context, String str, String str2, String str3, Bundle bundle) {
        Intrinsics.h(context, str);
        Intrinsics.h(bundle, str2);
        return bundle.getString(str3);
    }

    public static String h(String str, Text text, String str2) {
        return str + text + str2;
    }

    public static String i(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static String j(String str, String str2, String str3, boolean z, String str4) {
        return str + str2 + str3 + z + str4;
    }

    public static String k(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String l(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String m(String str, boolean z, String str2, String str3, String str4) {
        return str + z + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb, AnalyticsData analyticsData, String str) {
        sb.append(analyticsData);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder r(double d, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(d);
        return sb;
    }

    public static StringBuilder s(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static Iterator u(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static List v() {
        return CollectionsKt.Q(new CompiledArgument());
    }

    public static NoWhenBranchMatchedException w(int i, ComposerImpl composerImpl, boolean z) {
        composerImpl.o(i);
        composerImpl.V(z);
        return new NoWhenBranchMatchedException();
    }

    public static NoWhenBranchMatchedException x(Composer composer, int i) {
        composer.o(i);
        composer.l();
        return new NoWhenBranchMatchedException();
    }

    public static void y(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void z(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }
}

package au.com.woolworths.dynamic.page.ui.content;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledNotNullType;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.UnionType;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static void A(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void B(boolean z, Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, String str) {
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(z));
        jsonWriter.F1(str);
    }

    public static boolean C(Set set, Set set2, List list, String str, BooleanExpression.And and) {
        return BooleanExpressions.b(and, new com.apollographql.apollo.api.a(set, set2, list, str));
    }

    public static CompiledFragment D(CompiledFragment.Builder builder) {
        builder.b(AnalyticsFieldsSelections.b);
        return builder.a();
    }

    public static int a(ActionType actionType, int i, int i2) {
        return (actionType.hashCode() + i) * i2;
    }

    public static int b(CardHeight cardHeight, int i, int i2) {
        return (cardHeight.hashCode() + i) * i2;
    }

    public static int c(InsetBannerActionType insetBannerActionType, int i, int i2) {
        return (insetBannerActionType.hashCode() + i) * i2;
    }

    public static int d(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static long e(LazyGridItemSpanScope lazyGridItemSpanScope, String str) {
        Intrinsics.h(lazyGridItemSpanScope, str);
        return LazyGridSpanKt.a(lazyGridItemSpanScope.a());
    }

    public static SharedIntrinsicHeightState f(ComposerImpl composerImpl) {
        SharedIntrinsicHeightState sharedIntrinsicHeightState = new SharedIntrinsicHeightState();
        composerImpl.A(sharedIntrinsicHeightState);
        return sharedIntrinsicHeightState;
    }

    public static CompiledField g(String str, CustomScalarType customScalarType) {
        return new CompiledField.Builder(str, customScalarType).c();
    }

    public static CompiledFragment h(CompiledFragment.Builder builder) {
        builder.b(ProductCardSelections.A);
        return builder.a();
    }

    public static CompiledFragment i(String str, boolean z, CompiledFragment.Builder builder, List list) {
        builder.c = CollectionsKt.Q(new CompiledCondition(str, z));
        builder.b(list);
        return builder.a();
    }

    public static CompiledNotNullType j(UnionType unionType) {
        return CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(unionType)));
    }

    public static Object k(CustomScalarAdapters customScalarAdapters, CustomScalarType customScalarType, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters2) {
        return Adapters.b(customScalarAdapters.e(customScalarType)).fromJson(jsonReader, customScalarAdapters2);
    }

    public static String l(ComposerImpl composerImpl, int i, int i2, ComposerImpl composerImpl2, boolean z) {
        composerImpl.o(i);
        String strC = StringResources_androidKt.c(composerImpl2, i2);
        composerImpl.V(z);
        return strC;
    }

    public static String m(String str, Screen screen, String str2) {
        return str + screen + str2;
    }

    public static String n(String str, ProductCard productCard, String str2) {
        return str + productCard + str2;
    }

    public static String o(String str, String str2, String str3, au.com.woolworths.graphql.common.fragment.ProductCard productCard, String str4) {
        return str + str2 + str3 + productCard + str4;
    }

    public static String p(String str, String str2, String str3, AnalyticsFields analyticsFields, String str4) {
        return str + str2 + str3 + analyticsFields + str4;
    }

    public static String q(String str, String str2, String str3, String str4, ArrayList arrayList) {
        return str + str2 + str3 + arrayList + str4;
    }

    public static String r(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder s(String str, ActionType actionType, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(actionType);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder t(String str, InsetBannerActionPlacement insetBannerActionPlacement, String str2, InsetBannerActionType insetBannerActionType, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(insetBannerActionPlacement);
        sb.append(str2);
        sb.append(insetBannerActionType);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, InsetBannerDisplayType insetBannerDisplayType, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(insetBannerDisplayType);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder v(String str, Integer num, String str2, Integer num2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(num2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder w(String str, String str2, String str3, ActionType actionType, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(actionType);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3, String str4, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(arrayList);
        sb.append(str4);
        return sb;
    }

    public static void y(int i, Adapters$IntAdapter$1 adapters$IntAdapter$1, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, String str) {
        adapters$IntAdapter$1.toJson(jsonWriter, customScalarAdapters, Integer.valueOf(i));
        jsonWriter.F1(str);
    }

    public static void z(ImageView imageView, int i, ImageView imageView2, String str, Drawable drawable) {
        BindingAdaptersKt.g(imageView2, str, drawable, AppCompatResources.b(i, imageView.getContext()));
    }
}

package au.com.woolworths.sdui.shop.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CompatibleColor;
import au.com.woolworths.shop.graphql.type.CoreColorTheme;
import au.com.woolworths.shop.graphql.type.CoreForegroundColors;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.IconAsset;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/selections/CoreTagUISelections;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreTagUISelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10084a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CompatibleColor", CollectionsKt.Q("CompatibleColor"));
        List list = CompatibleColorSelections.f10082a;
        builder.b(list);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f10084a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("CompatibleColor", CollectionsKt.Q("CompatibleColor"));
        builder2.d = list;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("CompatibleColor", CollectionsKt.Q("CompatibleColor"));
        builder3.d = list;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder3.a());
        c = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("CompatibleColor", CollectionsKt.Q("CompatibleColor"));
        builder4.d = list;
        List listR4 = CollectionsKt.R(compiledFieldC4, builder4.a());
        d = listR4;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = CompatibleColor.f11275a;
        CompiledField.Builder builder5 = new CompiledField.Builder("primary", CompiledGraphQL.b(objectType));
        builder5.e = listR2;
        CompiledField compiledFieldC6 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("secondary", CompiledGraphQL.b(objectType));
        builder6.e = listR3;
        CompiledField compiledFieldC7 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("highlight", CompiledGraphQL.b(objectType));
        builder7.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldC7, builder7.c());
        e = listR5;
        CompiledField compiledFieldC8 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder8 = new CompiledField.Builder("background", CompiledGraphQL.b(objectType));
        builder8.e = listR;
        CompiledField compiledFieldC9 = builder8.c();
        CompiledField.Builder builder9 = new CompiledField.Builder("foreground", CompiledGraphQL.b(CoreForegroundColors.f11289a));
        builder9.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC8, compiledFieldC9, builder9.c());
        f = listR6;
        CompiledField compiledFieldC10 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("IconAsset", CollectionsKt.R("HostedIcon", "CoreIcon"));
        builder10.b(IconFragmentSelections.c);
        List listR7 = CollectionsKt.R(compiledFieldC10, builder10.a());
        g = listR7;
        CompiledField compiledFieldC11 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC12 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder11 = new CompiledField.Builder("coreColorTheme", CompiledGraphQL.b(CoreColorTheme.f11288a));
        builder11.e = listR6;
        CompiledField compiledFieldC13 = builder11.c();
        CompiledField compiledFieldC14 = new CompiledField.Builder("hasBorder", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField.Builder builder12 = new CompiledField.Builder(BarcodePickDeserializer.FIELD_ICON, IconAsset.f11477a);
        builder12.e = listR7;
        h = CollectionsKt.R(compiledFieldC11, compiledFieldC12, compiledFieldC13, compiledFieldC14, builder12.c());
    }

    public static List a() {
        return h;
    }
}

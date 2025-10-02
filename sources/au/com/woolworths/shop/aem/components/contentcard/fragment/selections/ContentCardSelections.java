package au.com.woolworths.shop.aem.components.contentcard.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ContentCardFooter;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ImageWithAlt;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/contentcard/fragment/selections/ContentCardSelections;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentCardSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10139a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        ActionType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c());
        f10139a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        FooterStyle.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("style", CompiledGraphQL.b(FooterStyle.f)).c();
        CompiledField compiledFieldG = d.g(TextBundle.TEXT_ENTRY, customScalarType);
        ObjectType objectType = ImageWithAlt.f11487a;
        CompiledField.Builder builder = new CompiledField.Builder("logo", objectType);
        builder.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC2, compiledFieldG, builder.c());
        d = listR4;
        CompiledField compiledFieldG2 = d.g("contentCardId", customScalarType);
        CompiledField compiledFieldC3 = new CompiledField.Builder("contentCardImageUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG3 = d.g("contentCardTitle", customScalarType);
        CompiledField compiledFieldG4 = d.g("contentCardDescription", customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("contentCardAction", Action.f10997a);
        builder2.e = listR;
        CompiledField compiledFieldC4 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("contentCardBrandImage", objectType);
        builder3.e = listR2;
        CompiledField compiledFieldC5 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("contentCardFooter", ContentCardFooter.f11281a);
        builder4.e = listR4;
        e = CollectionsKt.R(compiledFieldG2, compiledFieldC3, compiledFieldG3, compiledFieldG4, compiledFieldC4, compiledFieldC5, builder4.c());
    }
}

package au.com.woolworths.foundation.shop.prompt.handler.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreButton;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.PromptCta;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/selections/PromptsSelections;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromptsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8884a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;

    static {
        ActionType.e.getClass();
        EnumType enumType = ActionType.f;
        CompiledField compiledFieldC = new CompiledField.Builder("type", CompiledGraphQL.b(enumType)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c());
        f8884a = listR;
        CoreButtonStyle.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("coreButtonStyle", CompiledGraphQL.b(CoreButtonStyle.f)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("coreButtonLabel", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = Action.f10997a;
        CompiledField.Builder builder = new CompiledField.Builder("coreButtonAction", CompiledGraphQL.b(objectType));
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder.c(), new CompiledField.Builder("coreButtonEnabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        b = listR2;
        CompiledField compiledFieldC4 = new CompiledField.Builder("bottomSheetTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("bottomSheetBody", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("bottomSheetButtons", CompiledGraphQL.b(CompiledGraphQL.a(CoreButton.f11287a)));
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, builder2.c());
        c = listR3;
        List listR4 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(enumType)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c());
        d = listR4;
        CompiledField compiledFieldC6 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(objectType));
        builder3.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC6, builder3.c());
        e = listR5;
        List listR6 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(enumType)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c());
        f = listR6;
        CompiledField compiledFieldC7 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(objectType));
        builder4.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC7, builder4.c());
        g = listR7;
        CompiledField compiledFieldC8 = new CompiledField.Builder("alertTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("alertBody", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType2 = PromptCta.f11805a;
        CompiledField.Builder builder5 = new CompiledField.Builder("alertPrimaryCta", CompiledGraphQL.b(objectType2));
        builder5.e = listR5;
        CompiledField compiledFieldC10 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("alertSecondaryCta", objectType2);
        builder6.e = listR7;
        List listR8 = CollectionsKt.R(compiledFieldC8, compiledFieldC9, compiledFieldC10, builder6.c());
        h = listR8;
        CompiledField compiledFieldC11 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("BottomSheet", CollectionsKt.Q("BottomSheet"));
        builder7.d = listR3;
        CompiledFragment compiledFragmentA = builder7.a();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("PromptAlert", CollectionsKt.Q("PromptAlert"));
        builder8.d = listR8;
        i = CollectionsKt.R(compiledFieldC11, compiledFragmentA, builder8.a());
    }
}

package com.woolworths.shop.checkout.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.IdVerificationBottomSheet;
import au.com.woolworths.shop.graphql.type.IdVerificationCompleteResponse;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/selections/CompleteIdVerificationMutationSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompleteIdVerificationMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22551a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        f22551a = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        EnumType enumType = ButtonStyle.f;
        CompiledField compiledFieldC2 = new CompiledField.Builder("style", enumType).c();
        CustomScalarType customScalarType2 = GraphQLBoolean.f11439a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType2)).c());
        b = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), a.d("style", enumType), new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType2)).c());
        c = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("body", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("imageUrls", a.e(customScalarType)).c();
        ObjectType objectType = Button.f11080a;
        CompiledField.Builder builder = new CompiledField.Builder("primaryButton", objectType);
        builder.e = listR;
        CompiledField compiledFieldC6 = builder.c();
        CompiledField.Builder builder2 = new CompiledField.Builder("secondaryButton", objectType);
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, builder2.c());
        d = listR3;
        CompiledField.Builder builder3 = new CompiledField.Builder("idVerificationBottomSheet", CompiledGraphQL.b(IdVerificationBottomSheet.f11480a));
        builder3.e = listR3;
        List listQ2 = CollectionsKt.Q(builder3.c());
        e = listQ2;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("IdVerificationCompleteSuccess", CollectionsKt.Q("IdVerificationCompleteSuccess"));
        builder4.d = listQ;
        CompiledFragment compiledFragmentA = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("IdVerificationCompleteFail", CollectionsKt.Q("IdVerificationCompleteFail"));
        builder5.d = listQ2;
        List listR4 = CollectionsKt.R(compiledFieldC7, compiledFragmentA, builder5.a());
        f = listR4;
        CompiledField.Builder builder6 = new CompiledField.Builder("completeIdVerification", CompiledGraphQL.b(IdVerificationCompleteResponse.f11482a));
        new CompiledArgument.Builder(Mutation.N);
        builder6.d = au.com.woolworths.android.onesite.a.v();
        builder6.e = listR4;
        g = CollectionsKt.Q(builder6.c());
    }
}

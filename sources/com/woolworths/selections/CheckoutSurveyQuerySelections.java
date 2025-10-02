package com.woolworths.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CheckoutSurvey;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.Question;
import au.com.woolworths.shop.graphql.type.SurveyQuestionType;
import au.com.woolworths.shop.graphql.type.VocSurvey;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/selections/CheckoutSurveyQuerySelections;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutSurveyQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21387a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLID.f11441a;
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        CompiledField compiledFieldC2 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType2)).c();
        SurveyQuestionType.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("type", CompiledGraphQL.b(SurveyQuestionType.f)).c());
        f21387a = listR;
        CompiledField compiledFieldC3 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType2)).c();
        ButtonStyle.e.getClass();
        List listR2 = CollectionsKt.R(compiledFieldC3, new CompiledField.Builder("style", ButtonStyle.f).c(), new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        b = listR2;
        CompiledField compiledFieldG = d.g("surveyUrl", customScalarType2);
        CompiledField compiledFieldC4 = new CompiledField.Builder("promptTitle", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldG2 = d.g("promptSubTitle", customScalarType2);
        CompiledField.Builder builder = new CompiledField.Builder("cta", CompiledGraphQL.b(Button.f11080a));
        builder.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldG, compiledFieldC4, compiledFieldG2, builder.c(), d.g("screenTitle", customScalarType2));
        c = listR3;
        CompiledField.Builder builder2 = new CompiledField.Builder("questions", a.f(Question.f11809a));
        builder2.e = listR;
        CompiledField compiledFieldC5 = builder2.c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("responseId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("surveyId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("commentPrompt", customScalarType2).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("commentText", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("vocSurvey", VocSurvey.f12012a);
        builder3.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldC9, builder3.c());
        d = listR4;
        CompiledField.Builder builder4 = new CompiledField.Builder("checkoutSurvey", CheckoutSurvey.f11269a);
        new CompiledArgument.Builder(Query.A1);
        builder4.d = au.com.woolworths.android.onesite.a.v();
        builder4.e = listR4;
        e = CollectionsKt.Q(builder4.c());
    }
}

package au.com.woolworths.feature.shop.voc;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.voc.data.SurveyData;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestion;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestionType;
import au.com.woolworths.feature.shop.voc.data.VocSurveyData;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.woolworths.CheckoutSurveyQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"voc_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckoutSurveyQueryCheckoutSurveyExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [au.com.woolworths.feature.shop.voc.data.VocSurveyData] */
    /* JADX WARN: Type inference failed for: r9v0, types: [au.com.woolworths.feature.shop.voc.data.VocSurveyData] */
    public static final SurveyData a(CheckoutSurveyQuery.CheckoutSurvey checkoutSurvey) {
        String str = checkoutSurvey.c;
        String str2 = checkoutSurvey.b;
        String str3 = checkoutSurvey.d;
        String str4 = checkoutSurvey.e;
        ArrayList<CheckoutSurveyQuery.Question> arrayList = checkoutSurvey.f19213a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (CheckoutSurveyQuery.Question question : arrayList) {
            Intrinsics.h(question, "<this>");
            String str5 = question.f19216a;
            String str6 = question.b;
            int iOrdinal = question.c.ordinal();
            arrayList2.add(new SurveyQuestion(str5, str6, iOrdinal != 0 ? iOrdinal != 1 ? SurveyQuestionType.g : SurveyQuestionType.f : SurveyQuestionType.e));
        }
        CheckoutSurveyQuery.VocSurvey vocSurvey = checkoutSurvey.f;
        ButtonStyleApiData vocSurveyData = null;
        if (vocSurvey != null) {
            String str7 = vocSurvey.f19217a;
            String str8 = vocSurvey.b;
            String str9 = vocSurvey.c;
            CheckoutSurveyQuery.Cta cta = vocSurvey.d;
            String str10 = cta.f19214a;
            ButtonStyle buttonStyle = cta.b;
            if (buttonStyle != null) {
                int iOrdinal2 = buttonStyle.ordinal();
                vocSurveyData = iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? iOrdinal2 != 5 ? ButtonStyleApiData.d : ButtonStyleApiData.INSTOCK : ButtonStyleApiData.INFO : ButtonStyleApiData.DESTRUCTIVE : ButtonStyleApiData.TERTIARY : ButtonStyleApiData.SECONDARY : ButtonStyleApiData.PRIMARY;
            }
            vocSurveyData = new VocSurveyData(str7, str8, str9, new ButtonApiData(str10, null, vocSurveyData, cta.c, null, null, null, null, null, 498, null), vocSurvey.e);
        }
        return new SurveyData(str, str2, str3, str4, arrayList2, vocSurveyData);
    }
}

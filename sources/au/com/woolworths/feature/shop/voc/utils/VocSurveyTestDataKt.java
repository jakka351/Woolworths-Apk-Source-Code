package au.com.woolworths.feature.shop.voc.utils;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.voc.data.SurveyData;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestion;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestionType;
import au.com.woolworths.feature.shop.voc.data.VocSurveyData;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"voc_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VocSurveyTestDataKt {
    public static final VocContract.ViewState a(String str, String str2, ButtonStyleApiData buttonStyleApiData) {
        return new VocContract.ViewState(false, false, new SurveyData("checkout-v1", "ae4956df-d73c-43fa-b8d2-f54fabaae8e8", "Leave a comment", "Thanks, let us know more about your response.", CollectionsKt.Q(new SurveyQuestion("checkout-v1-q1-nps", "How likely are you to recommend shopping with the Woolworths app?", SurveyQuestionType.e)), new VocSurveyData("https://adminuatsite.woolworths.com.au/shop/discover/voc-survey-test?nps_response_id=ae4956df-d73c-43fa-b8d2-f54fabaae8e8", str, str2, new ButtonApiData("Start survey", null, buttonStyleApiData, true, null, null, null, null, null, 498, null), "Feedback survey")), str, str2, 3173);
    }
}

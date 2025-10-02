package au.com.woolworths.feature.shop.voc.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/data/SurveyQuestionType;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SurveyQuestionType {
    public static final SurveyQuestionType e;
    public static final SurveyQuestionType f;
    public static final SurveyQuestionType g;
    public static final /* synthetic */ SurveyQuestionType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final boolean d;

    static {
        SurveyQuestionType surveyQuestionType = new SurveyQuestionType("NPS", 0, true);
        e = surveyQuestionType;
        SurveyQuestionType surveyQuestionType2 = new SurveyQuestionType("FIVE_STAR", 1, true);
        f = surveyQuestionType2;
        SurveyQuestionType surveyQuestionType3 = new SurveyQuestionType("UNKNOWN", 2, false);
        g = surveyQuestionType3;
        SurveyQuestionType[] surveyQuestionTypeArr = {surveyQuestionType, surveyQuestionType2, surveyQuestionType3};
        h = surveyQuestionTypeArr;
        i = EnumEntriesKt.a(surveyQuestionTypeArr);
    }

    public SurveyQuestionType(String str, int i2, boolean z) {
        this.d = z;
    }

    public static SurveyQuestionType valueOf(String str) {
        return (SurveyQuestionType) Enum.valueOf(SurveyQuestionType.class, str);
    }

    public static SurveyQuestionType[] values() {
        return (SurveyQuestionType[]) h.clone();
    }
}

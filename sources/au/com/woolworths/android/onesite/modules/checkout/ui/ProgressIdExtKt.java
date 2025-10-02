package au.com.woolworths.android.onesite.modules.checkout.ui;

import android.content.Context;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app-common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressIdExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProgressId.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressId progressId = ProgressId.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final List a(ProgressId progressId, Context context) {
        Intrinsics.h(context, "context");
        int iOrdinal = progressId.ordinal();
        if (iOrdinal == 2) {
            ProgressId progressId2 = ProgressId.d;
            String string = context.getString(R.string.details_step_title);
            Intrinsics.g(string, "getString(...)");
            ProgressStep progressStep = new ProgressStep(progressId2, "", string, new ResText(R.string.progress_step_done_content_description), false);
            ProgressId progressId3 = ProgressId.e;
            String string2 = context.getString(R.string.products_step_title);
            Intrinsics.g(string2, "getString(...)");
            ProgressStep progressStep2 = new ProgressStep(progressId3, "", string2, new ResText(R.string.progress_step_done_content_description), false);
            ProgressId progressId4 = ProgressId.f;
            String string3 = context.getString(R.string.summary_step_title);
            Intrinsics.g(string3, "getString(...)");
            ProgressStep progressStep3 = new ProgressStep(progressId4, "3", string3, new PlainText("3"), true);
            ProgressId progressId5 = ProgressId.g;
            String string4 = context.getString(R.string.pay_step_title);
            Intrinsics.g(string4, "getString(...)");
            return CollectionsKt.R(progressStep, progressStep2, progressStep3, new ProgressStep(progressId5, "4", string4, new PlainText("4"), false));
        }
        if (iOrdinal != 3) {
            return EmptyList.d;
        }
        ProgressId progressId6 = ProgressId.d;
        String string5 = context.getString(R.string.details_step_title);
        Intrinsics.g(string5, "getString(...)");
        ProgressStep progressStep4 = new ProgressStep(progressId6, "", string5, new ResText(R.string.progress_step_done_content_description), false);
        ProgressId progressId7 = ProgressId.e;
        String string6 = context.getString(R.string.products_step_title);
        Intrinsics.g(string6, "getString(...)");
        ProgressStep progressStep5 = new ProgressStep(progressId7, "", string6, new ResText(R.string.progress_step_done_content_description), false);
        ProgressId progressId8 = ProgressId.f;
        String string7 = context.getString(R.string.summary_step_title);
        Intrinsics.g(string7, "getString(...)");
        ProgressStep progressStep6 = new ProgressStep(progressId8, "", string7, new ResText(R.string.progress_step_done_content_description), false);
        ProgressId progressId9 = ProgressId.g;
        String string8 = context.getString(R.string.pay_step_title);
        Intrinsics.g(string8, "getString(...)");
        return CollectionsKt.R(progressStep4, progressStep5, progressStep6, new ProgressStep(progressId9, "4", string8, new PlainText("4"), true));
    }
}

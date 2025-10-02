package au.com.woolworths.feature.shop.contentpage;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentPageFragment e;

    public /* synthetic */ a(ContentPageFragment contentPageFragment, int i) {
        this.d = i;
        this.e = contentPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ContentPageViewModel contentPageViewModelI1 = this.e.I1();
                BuildersKt.c(ViewModelKt.a(contentPageViewModelI1), null, null, new ContentPageViewModel$fetchContentPage$1(contentPageViewModelI1, null), 3);
                break;
            case 1:
                Bundle arguments = this.e.getArguments();
                ContentPageFragment.Extras extras = arguments != null ? (ContentPageFragment.Extras) arguments.getParcelable("EXTRA_DATA") : null;
                ContentPageFragment.Extras extras2 = extras != null ? extras : null;
                if (extras2 != null) {
                    return extras2;
                }
                throw new IllegalStateException("Content Page: Fragment should be launched with extra Content Page Data!");
            case 2:
                Bundle arguments2 = this.e.getArguments();
                return Boolean.valueOf(arguments2 != null ? arguments2.getBoolean("should_show_top_bar") : true);
            default:
                this.e.requireActivity().finish();
                break;
        }
        return Unit.f24250a;
    }
}

package au.com.woolworths.feature.shop.voc;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.voc.databinding.ActivityVocSurveyWebViewBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f8218a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(44, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "bannerState");
            sparseArrayB.put(5, "brandLabel");
            sparseArrayB.put(6, "buttonText");
            sparseArrayB.put(7, "buttonTint");
            sparseArrayB.put(8, "clickHandler");
            sparseArrayB.put(9, "clickHandlers");
            sparseArrayB.put(10, "clickListener");
            sparseArrayB.put(11, "coachMark");
            sparseArrayB.put(12, "data");
            sparseArrayB.put(13, "enabled");
            sparseArrayB.put(14, "errorState");
            sparseArrayB.put(15, "handler");
            sparseArrayB.put(16, "heightRes");
            sparseArrayB.put(17, "imageLoaderListener");
            sparseArrayB.put(18, "importantForAccessibility");
            sparseArrayB.put(19, "index");
            sparseArrayB.put(20, "infoSectionItem");
            sparseArrayB.put(21, "inlineMessage");
            sparseArrayB.put(22, "isChecked");
            sparseArrayB.put(23, "isEnabled");
            sparseArrayB.put(24, "isLowerPriceYellow");
            sparseArrayB.put(25, "isRewardStyle");
            sparseArrayB.put(26, "isUnlocking");
            sparseArrayB.put(27, "itemWidthRes");
            sparseArrayB.put(28, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(29, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(30, "loadingMessage");
            sparseArrayB.put(31, "lottieAutoPlay");
            sparseArrayB.put(32, "lottieBackgroundColor");
            sparseArrayB.put(33, "lottieLoop");
            sparseArrayB.put(34, "margins");
            sparseArrayB.put(35, "onQueryTextChangeListener");
            sparseArrayB.put(36, "onQueryTextFocusChangeListener");
            sparseArrayB.put(37, "onQueryTextSubmitListener");
            sparseArrayB.put(38, "searchQueryHint");
            sparseArrayB.put(39, "sectionTitle");
            sparseArrayB.put(40, "state");
            sparseArrayB.put(41, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(42, "viewListener");
            sparseArrayB.put(43, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f8219a;

        static {
            HashMap map = new HashMap(1);
            f8219a = map;
            map.put("layout/activity_voc_survey_web_view_0", Integer.valueOf(com.woolworths.R.layout.activity_voc_survey_web_view));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f8218a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_voc_survey_web_view, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f8218a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/activity_voc_survey_web_view_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_voc_survey_web_view is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, ActivityVocSurveyWebViewBindingImpl.F, ActivityVocSurveyWebViewBindingImpl.G);
                ActivityVocSurveyWebViewBindingImpl activityVocSurveyWebViewBindingImpl = new ActivityVocSurveyWebViewBindingImpl(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[3], (ContentLoadingProgressBar) objArrT[2], (View) objArrT[1], (Toolbar) objArrT[5], (WebView) objArrT[6]);
                activityVocSurveyWebViewBindingImpl.E = -1L;
                IncludeGenericErrorStateBinding includeGenericErrorStateBinding = activityVocSurveyWebViewBindingImpl.y;
                if (includeGenericErrorStateBinding != null) {
                    includeGenericErrorStateBinding.n = activityVocSurveyWebViewBindingImpl;
                }
                activityVocSurveyWebViewBindingImpl.z.setTag(null);
                ((ConstraintLayout) objArrT[0]).setTag(null);
                activityVocSurveyWebViewBindingImpl.A.setTag(null);
                activityVocSurveyWebViewBindingImpl.E(view);
                activityVocSurveyWebViewBindingImpl.r();
                return activityVocSurveyWebViewBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f8218a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f8219a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}

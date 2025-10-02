package com.woolworths.scanlibrary.ui.entry.controller;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.product.details.b;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.net.a;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.scanlibrary.SngViewLandingContentBindingModel_;
import com.woolworths.scanlibrary.SngViewLandingLogoBindingModel_;
import com.woolworths.scanlibrary.SngViewLandingTitleBindingModel_;
import com.woolworths.scanlibrary.databinding.EpoxySngViewLandingContentBinding;
import com.woolworths.scanlibrary.ui.entry.content.ContentItem;
import com.woolworths.scanlibrary.ui.entry.content.ContentTitle;
import com.woolworths.scanlibrary.ui.entry.content.LandingContent;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentAction;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentActionListener;
import com.woolworths.scanlibrary.ui.entry.content.TopLogo;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/controller/LandingContentController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcom/woolworths/scanlibrary/ui/entry/content/LandingContent;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/woolworths/scanlibrary/ui/entry/content/LandingContentActionListener;", "<init>", "(Lcom/woolworths/scanlibrary/ui/entry/content/LandingContentActionListener;)V", "buildModels", "", "data", "bindContentItem", "contentItem", "Lcom/woolworths/scanlibrary/ui/entry/content/ContentItem;", "configureContentItemCta", "binding", "Lcom/woolworths/scanlibrary/databinding/EpoxySngViewLandingContentBinding;", "clickableText", "", UrlHandler.ACTION, "Lcom/woolworths/scanlibrary/ui/entry/content/LandingContentAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LandingContentController extends TypedEpoxyController<List<? extends LandingContent>> {
    public static final int $stable = 8;

    @NotNull
    private final LandingContentActionListener listener;

    public LandingContentController(@NotNull LandingContentActionListener listener) {
        Intrinsics.h(listener, "listener");
        this.listener = listener;
    }

    private final void bindContentItem(ContentItem contentItem) {
        SngViewLandingContentBindingModel_ sngViewLandingContentBindingModel_ = new SngViewLandingContentBindingModel_();
        sngViewLandingContentBindingModel_.M("landing_content_" + contentItem.b.hashCode());
        sngViewLandingContentBindingModel_.t();
        sngViewLandingContentBindingModel_.p = contentItem;
        LandingContentActionListener landingContentActionListener = this.listener;
        sngViewLandingContentBindingModel_.t();
        sngViewLandingContentBindingModel_.q = landingContentActionListener;
        b bVar = new b(11, contentItem, this);
        sngViewLandingContentBindingModel_.t();
        sngViewLandingContentBindingModel_.n = bVar;
        a aVar = new a(22);
        sngViewLandingContentBindingModel_.t();
        sngViewLandingContentBindingModel_.o = aVar;
        add(sngViewLandingContentBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContentItem$lambda$9$lambda$5(ContentItem contentItem, LandingContentController landingContentController, SngViewLandingContentBindingModel_ sngViewLandingContentBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        String str = contentItem.d;
        LandingContentAction landingContentAction = contentItem.e;
        if (landingContentAction == null || str == null) {
            return;
        }
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type com.woolworths.scanlibrary.databinding.EpoxySngViewLandingContentBinding");
        landingContentController.configureContentItemCta((EpoxySngViewLandingContentBinding) viewDataBinding, str, landingContentAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContentItem$lambda$9$lambda$8(SngViewLandingContentBindingModel_ sngViewLandingContentBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type com.woolworths.scanlibrary.databinding.EpoxySngViewLandingContentBinding");
        ((EpoxySngViewLandingContentBinding) viewDataBinding).z.setText((CharSequence) null);
    }

    private final void configureContentItemCta(EpoxySngViewLandingContentBinding binding, String clickableText, LandingContentAction action) {
        SpannableString spannableString = new SpannableString(clickableText);
        SpannableStringExtKt.a(spannableString, clickableText, null, new coil3.gif.a(2, this, action));
        TextView textView = binding.z;
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureContentItemCta$lambda$10(LandingContentController landingContentController, LandingContentAction landingContentAction) {
        landingContentController.listener.x3(landingContentAction);
        return Unit.f24250a;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable List<? extends LandingContent> data) {
        if (data != null) {
            for (LandingContent landingContent : data) {
                if (landingContent instanceof TopLogo) {
                    SngViewLandingLogoBindingModel_ sngViewLandingLogoBindingModel_ = new SngViewLandingLogoBindingModel_();
                    sngViewLandingLogoBindingModel_.M();
                    sngViewLandingLogoBindingModel_.t();
                    sngViewLandingLogoBindingModel_.n = (TopLogo) landingContent;
                    add(sngViewLandingLogoBindingModel_);
                } else if (landingContent instanceof ContentTitle) {
                    SngViewLandingTitleBindingModel_ sngViewLandingTitleBindingModel_ = new SngViewLandingTitleBindingModel_();
                    ContentTitle contentTitle = (ContentTitle) landingContent;
                    sngViewLandingTitleBindingModel_.M("landing_title_" + contentTitle.f21253a.hashCode());
                    sngViewLandingTitleBindingModel_.t();
                    sngViewLandingTitleBindingModel_.n = contentTitle;
                    add(sngViewLandingTitleBindingModel_);
                } else {
                    if (!(landingContent instanceof ContentItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bindContentItem((ContentItem) landingContent);
                }
            }
        }
    }
}

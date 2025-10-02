package com.woolworths.scanlibrary.ui.message;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity;
import com.woolworths.scanlibrary.databinding.ActivityMessageBinding;
import com.woolworths.scanlibrary.ui.message.MessageActivityContract;
import com.woolworths.scanlibrary.ui.message.singleAction.MessageSingleActionFragment;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/MessageActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragmentActivity;", "Lcom/woolworths/scanlibrary/ui/message/MessageActivityContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/message/MessageActivityContract$View;", "Lcom/woolworths/scanlibrary/ui/message/singleAction/MessageSingleActionFragment$MessageSingleActionFragmentInteraction;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageActivity extends DaggerBaseFragmentActivity<MessageActivityContract.Presenter> implements MessageActivityContract.View, MessageSingleActionFragment.MessageSingleActionFragmentInteraction {
    public static final /* synthetic */ int J = 0;
    public ActivityMessageBinding I;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/MessageActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Fragment fragment2, Messages messages) {
            FragmentActivity activity = fragment2.getActivity();
            if (activity != null) {
                Pair[] pairArr = {new Pair("messageName", messages.name())};
                Intent intent = new Intent(activity, (Class<?>) MessageActivity.class);
                intent.addFlags(0);
                intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
                activity.startActivity(intent);
            }
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_message;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ActivityMessageBinding activityMessageBinding = (ActivityMessageBinding) DataBindingUtil.d(this, R.layout.activity_message);
        this.I = activityMessageBinding;
        if (activityMessageBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        FrameLayout contentFrame = activityMessageBinding.y;
        Intrinsics.g(contentFrame, "contentFrame");
        ViewExtKt.b(contentFrame, new b(14));
        ActivityMessageBinding activityMessageBinding2 = this.I;
        if (activityMessageBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityMessageBinding2.z.y);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.u();
        String stringExtra = getIntent().getStringExtra("messageName");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (((MessageSingleActionFragment) getSupportFragmentManager().F(R.id.contentFrame)) == null) {
            MessageSingleActionFragment messageSingleActionFragment = new MessageSingleActionFragment();
            Bundle bundle = new Bundle();
            bundle.putString("param1", stringExtra);
            messageSingleActionFragment.setArguments(bundle);
            DaggerBaseFragmentActivity.c5(this, messageSingleActionFragment, R.id.contentFrame, null, 28);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.message.singleAction.MessageSingleActionFragment.MessageSingleActionFragmentInteraction
    public final void c4(String str) {
        ActivityMessageBinding activityMessageBinding = this.I;
        if (activityMessageBinding != null) {
            activityMessageBinding.z.z.setText(str);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }
}

package com.woolworths.scanlibrary.ui.message.singleAction;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.base.shopapp.customviews.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.databinding.FragmentMessageSingleActionBinding;
import com.woolworths.scanlibrary.ui.message.Messages;
import com.woolworths.scanlibrary.ui.message.singleAction.MessageContract;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/singleAction/MessageSingleActionFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/message/singleAction/MessageContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/message/singleAction/MessageContract$View;", "<init>", "()V", "MessageSingleActionFragmentInteraction", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageSingleActionFragment extends DaggerBaseFragment<MessageContract.Presenter> implements MessageContract.View {
    public String l = "";
    public MessageSingleActionFragmentInteraction m;
    public FragmentMessageSingleActionBinding n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/singleAction/MessageSingleActionFragment$Companion;", "", "", "ARG_MESSAGE_NAME", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/message/singleAction/MessageSingleActionFragment$MessageSingleActionFragmentInteraction;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MessageSingleActionFragmentInteraction {
        void c4(String str);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21276a;

        static {
            int[] iArr = new int[Messages.values().length];
            try {
                Messages.Companion companion = Messages.h;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Messages.Companion companion2 = Messages.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Messages.Companion companion3 = Messages.h;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Messages.Companion companion4 = Messages.h;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21276a = iArr;
        }
    }

    public static final void h2(MessageSingleActionFragment messageSingleActionFragment) {
        Messages.Companion companion = Messages.h;
        String str = messageSingleActionFragment.l;
        companion.getClass();
        Messages messagesA = Messages.Companion.a(str);
        int i = messagesA == null ? -1 : WhenMappings.f21276a[messagesA.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                FragmentActivity activity = messageSingleActionFragment.getActivity();
                if (activity != null) {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse("package:" + activity.getPackageName()));
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    activity.startActivity(intent);
                }
                FragmentActivity activity2 = messageSingleActionFragment.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            }
            if (i == 3) {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.BLUETOOTH_SETTINGS");
                messageSingleActionFragment.startActivity(intent2);
                FragmentActivity activity3 = messageSingleActionFragment.getActivity();
                if (activity3 != null) {
                    activity3.finish();
                    return;
                }
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            FragmentActivity activity4 = messageSingleActionFragment.getActivity();
            if (activity4 != null) {
                Intent intent3 = new Intent();
                intent3.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                intent3.addCategory("android.intent.category.DEFAULT");
                activity4.startActivity(intent3);
            }
            FragmentActivity activity5 = messageSingleActionFragment.getActivity();
            if (activity5 != null) {
                activity5.finish();
            }
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void N3(boolean z) {
        LoadingViewDelegate loadingViewDelegate = this.k;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof MessageSingleActionFragmentInteraction) {
            this.m = (MessageSingleActionFragmentInteraction) context;
            return;
        }
        throw new RuntimeException(context + " must implement MessageSingleActionFragmentInteraction");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("param1");
            if (string == null) {
                string = "";
            }
            this.l = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        Intrinsics.h(inflater, "inflater");
        int i = FragmentMessageSingleActionBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        this.n = (FragmentMessageSingleActionBinding) ViewDataBinding.q(inflater, R.layout.fragment_message_single_action, viewGroup, false, null);
        Messages.Companion companion = Messages.h;
        String str = this.l;
        companion.getClass();
        Messages messagesA = Messages.Companion.a(str);
        if (messagesA != null && (context = getContext()) != null) {
            FragmentMessageSingleActionBinding fragmentMessageSingleActionBinding = this.n;
            Intrinsics.e(fragmentMessageSingleActionBinding);
            fragmentMessageSingleActionBinding.B.setText(context.getString(messagesA.d));
            FragmentMessageSingleActionBinding fragmentMessageSingleActionBinding2 = this.n;
            Intrinsics.e(fragmentMessageSingleActionBinding2);
            fragmentMessageSingleActionBinding2.C.setText(context.getString(messagesA.e));
            FragmentMessageSingleActionBinding fragmentMessageSingleActionBinding3 = this.n;
            Intrinsics.e(fragmentMessageSingleActionBinding3);
            fragmentMessageSingleActionBinding3.z.setImageDrawable(context.getDrawable(messagesA.f));
            MessageSingleActionFragmentInteraction messageSingleActionFragmentInteraction = this.m;
            if (messageSingleActionFragmentInteraction != null) {
                String string = context.getString(messagesA.g);
                if (string == null) {
                    string = "";
                }
                messageSingleActionFragmentInteraction.c4(string);
            }
        }
        FragmentMessageSingleActionBinding fragmentMessageSingleActionBinding4 = this.n;
        Intrinsics.e(fragmentMessageSingleActionBinding4);
        fragmentMessageSingleActionBinding4.y.setOnClickListener(new a(this, 28));
        FragmentMessageSingleActionBinding fragmentMessageSingleActionBinding5 = this.n;
        Intrinsics.e(fragmentMessageSingleActionBinding5);
        return fragmentMessageSingleActionBinding5.h;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.m = null;
    }
}

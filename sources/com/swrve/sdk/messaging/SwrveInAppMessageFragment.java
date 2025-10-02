package com.swrve.sdk.messaging;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.swrve.sdk.SwrveInAppMessageActivity;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.SwrveSDKBase;
import com.swrve.sdk.config.SwrveConfigBase;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrveInAppMessageFragment extends Fragment {
    public long d;
    public GestureDetector e;

    /* JADX WARN: Type inference failed for: r11v3, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            SwrveInAppMessageActivity swrveInAppMessageActivity = (SwrveInAppMessageActivity) getActivity();
            SwrveConfigBase config = SwrveSDKBase.f19075a.getConfig();
            SwrveMessage swrveMessageQ4 = swrveInAppMessageActivity.Q4();
            SwrveMessageFormat swrveMessageFormatR4 = swrveInAppMessageActivity.R4();
            Map mapP4 = swrveInAppMessageActivity.P4();
            this.d = getArguments().getLong("PAGE_ID");
            return new SwrveMessageView(getContext(), config, swrveMessageQ4, swrveMessageFormatR4, mapP4, this.d, this.e);
        } catch (Exception e) {
            SwrveLogger.c("Error in SwrveInAppMessageFragment while creating the SwrveMessageView", e, new Object[0]);
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((SwrveInAppMessageActivity) getActivity()).T4(this.d);
    }
}

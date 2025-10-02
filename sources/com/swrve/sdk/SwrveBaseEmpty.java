package com.swrve.sdk;

import android.content.Context;
import au.com.woolworths.marketing.SwrveInteractor$identityResponse$1;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrveBaseEmpty<T, C extends SwrveConfigBase> implements ISwrveBase<T, C>, ISwrveCommon {
    public String d;
    public SwrveConfigBase e;
    public File f;

    public class SwrveConfigBaseImp extends SwrveConfigBase {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String A() {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void C() {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void D(String str) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void E(String str, Map map) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void F(SwrveBaseCampaign swrveBaseCampaign) {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void G(int i) {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void a() {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final int b() {
        return 0;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final File c(Context context) {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String d(String str) {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void e() {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void f(Context context, String str, ArrayList arrayList) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void g(SwrveBaseCampaign swrveBaseCampaign) {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String getApiKey() {
        return this.d;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final int getAppId() {
        return 0;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String getAppVersion() {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final SwrveConfigBase getConfig() {
        return this.e;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String getDeviceId() {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveBase, com.swrve.sdk.ISwrveCommon
    public final String getUserId() {
        return "unsupported_version";
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String h() {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String i() {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void k(SwrveResourcesListener swrveResourcesListener) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final File l() {
        return this.f;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void m(String str, SwrveInteractor$identityResponse$1 swrveInteractor$identityResponse$1) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void n(SwrveEmbeddedMessage swrveEmbeddedMessage, String str) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void o(String str) {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final int p() {
        return 0;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void q(SwrveEmbeddedMessage swrveEmbeddedMessage) {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final String r(SwrveEmbeddedMessage swrveEmbeddedMessage, Map map) {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void s() {
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void t(Map map) {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void v(String str) {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void w() {
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final boolean x() {
        return true;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final SwrveNotificationConfig y() {
        return null;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final ArrayList z() {
        return new ArrayList();
    }
}

package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ConfigureFrames;", "", "Builder", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigureFrames {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ConfigureFrames$Builder;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final FramesWebView f4658a;
        public final FramesSDKConfig b;
        public ActionType c;
        public final LinkedHashMap d;

        public Builder(FramesWebView framesWebView, FramesSDKConfig config) {
            Intrinsics.h(config, "config");
            this.f4658a = framesWebView;
            this.b = config;
            this.d = new LinkedHashMap();
        }

        public final void a(ControlType controlType, String str, String str2) {
            this.d.put(controlType, new ControlItemConfig(str, str2));
        }

        public final void b() {
            String strJ;
            FramesSDKConfig framesSDKConfig = this.b;
            Intrinsics.h(framesSDKConfig, "framesSDKConfig");
            InstantiateFramesSDKCommand instantiateFramesSDKCommand = new InstantiateFramesSDKCommand("frames.createFrameSDK = async function() { this.sdk = new FRAMES.FramesSDK(" + framesSDKConfig + "); }");
            FramesWebView framesWebView = this.f4658a;
            JavaScriptCommand.a(instantiateFramesSDKCommand, framesWebView);
            ActionType actionType = this.c;
            if (actionType == null) {
                Intrinsics.p("actionType");
                throw null;
            }
            JavaScriptCommand.a(new CreateActionCommand("frames.createAction = async function() { this.action = this.sdk.createAction(FRAMES.ActionTypes." + actionType.f4637a + " ," + actionType + "); } "), framesWebView);
            JavaScriptCommand.a(StartActionCommand.b, framesWebView);
            for (Map.Entry entry : this.d.entrySet()) {
                ControlType controlType = (ControlType) entry.getKey();
                ControlItemConfig controlItemConfig = (ControlItemConfig) entry.getValue();
                String str = controlType.d;
                String str2 = controlItemConfig.f4659a;
                String str3 = controlItemConfig.b;
                if (str3 != null) {
                    StringBuilder sbV = YU.a.v(" ", str3, "\n            action.createFramesControl('", str, "', '");
                    sbV.append(str2);
                    sbV.append("', options);\n        ");
                    strJ = StringsKt.m0(sbV.toString());
                } else {
                    strJ = YU.a.j(" action.createFramesControl('", str, "', '", str2, "');");
                }
                JavaScriptCommand.a(new CreateFramesControlCommand(StringsKt.n0("frames.controls.push(async function(action) {\n                " + strJ + "\n                let element = document.getElementById('" + str2 + "');\n                element.addEventListener(FRAMES.FramesEventType.OnValidated, () => { android.handleOnValidated(JSON.stringify(action.errors())) });\n                element.addEventListener(FRAMES.FramesEventType.OnBlur, () => { android.handleOnBlur() });\n                element.addEventListener(FRAMES.FramesEventType.OnFocus, () => { android.handleOnFocus() });\n                element.addEventListener(FRAMES.FramesCardinalEventType.OnRender, () => { android.handleOnRender() });\n                element.addEventListener(FRAMES.FramesCardinalEventType.OnClose, () => { android.handleOnClose() });\n            })")), framesWebView);
            }
            JavaScriptCommand.a(BuildFramesCommand.b, framesWebView);
        }
    }
}

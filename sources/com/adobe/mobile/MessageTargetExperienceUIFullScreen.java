package com.adobe.mobile;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import com.adobe.mobile.MessageFullScreen;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class MessageTargetExperienceUIFullScreen extends MessageFullScreen {

    public static class TargetPreviewExperienceUIWebviewClient extends MessageFullScreen.MessageFullScreenWebViewClient {
        @Override // com.adobe.mobile.MessageFullScreen.MessageFullScreenWebViewClient, android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws UnsupportedEncodingException {
            super.shouldOverrideUrlLoading(webView, str);
            if (!str.startsWith("adbinapp")) {
                Toast.makeText(webView.getContext(), "Error while reading the response from the Experience UI! (Response mal-formed)", 0).show();
                a(webView);
            } else if (str.contains("confirm")) {
                int iIndexOf = str.indexOf("at_preview_params=");
                if (iIndexOf >= 0) {
                    int iIndexOf2 = str.indexOf(38, iIndexOf);
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = str.length();
                    }
                    String strSubstring = str.substring(iIndexOf + 18, iIndexOf2);
                    if (!strSubstring.isEmpty()) {
                        try {
                            TargetPreviewManager targetPreviewManagerD = TargetPreviewManager.d();
                            String strDecode = URLDecoder.decode(strSubstring, "UTF-8");
                            synchronized (targetPreviewManagerD.f) {
                                targetPreviewManagerD.e = strDecode;
                            }
                        } catch (UnsupportedEncodingException e) {
                            StaticMethods.I("Could not decode the Target Preview parameters (%s)", e);
                        }
                    }
                }
                TargetPreviewManager.d().getClass();
            } else if (str.contains("cancel")) {
                TargetPreviewManager targetPreviewManagerD2 = TargetPreviewManager.d();
                targetPreviewManagerD2.getClass();
                MobileConfig mobileConfigB = MobileConfig.b();
                if (mobileConfigB.y != null) {
                    MessageTargetExperienceUIFullScreen messageTargetExperienceUIFullScreenE = TargetPreviewManager.d().e();
                    Iterator it = mobileConfigB.y.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Message) it.next()).f13268a.equalsIgnoreCase(messageTargetExperienceUIFullScreenE.f13268a)) {
                            it.remove();
                            break;
                        }
                    }
                }
                synchronized (TargetPreviewManager.j) {
                    targetPreviewManagerD2.d = null;
                }
                synchronized (targetPreviewManagerD2.f) {
                    targetPreviewManagerD2.e = null;
                }
                targetPreviewManagerD2.g = null;
                targetPreviewManagerD2.f13281a = null;
                targetPreviewManagerD2.b = -1.0f;
                targetPreviewManagerD2.c = -1.0f;
            }
            Messages.c(null);
            return true;
        }
    }

    public static class TargetPreviewFullScreenRunner extends MessageFullScreen.MessageFullScreenRunner {
        @Override // com.adobe.mobile.MessageFullScreen.MessageFullScreenRunner
        public final WebView a() {
            WebView webViewA = super.a();
            WebSettings settings = webViewA.getSettings();
            settings.setDomStorageEnabled(true);
            File fileO = StaticMethods.o();
            if (fileO != null) {
                settings.setDatabasePath(fileO.getPath());
                settings.setDatabaseEnabled(true);
            }
            return webViewA;
        }
    }

    @Override // com.adobe.mobile.MessageFullScreen, com.adobe.mobile.Message
    public final void n() {
        String str = TargetPreviewManager.d().g;
        this.r = str;
        if (str == null) {
            StaticMethods.J("Could not display the Target Preview Experience UI (no html payload found!)", new Object[0]);
        } else {
            super.n();
        }
    }

    @Override // com.adobe.mobile.MessageFullScreen
    public final MessageFullScreen.MessageFullScreenWebViewClient p() {
        return new TargetPreviewExperienceUIWebviewClient(this);
    }

    @Override // com.adobe.mobile.MessageFullScreen
    public final MessageFullScreen.MessageFullScreenRunner q(MessageFullScreen messageFullScreen) {
        return new TargetPreviewFullScreenRunner(messageFullScreen);
    }
}

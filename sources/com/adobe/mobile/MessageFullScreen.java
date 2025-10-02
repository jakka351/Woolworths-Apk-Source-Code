package com.adobe.mobile;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adobe.mobile.StaticMethods;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class MessageFullScreen extends Message {
    public String r;
    public String s;
    public WebView t;
    public MessageFullScreenActivity u;
    public ViewGroup v;
    public boolean w;

    public static class MessageFullScreenRunner implements Runnable {
        public final MessageFullScreen d;

        public MessageFullScreenRunner(MessageFullScreen messageFullScreen) {
            this.d = messageFullScreen;
        }

        public WebView a() {
            MessageFullScreen messageFullScreen = this.d;
            WebView webView = new WebView(messageFullScreen.u);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setBackgroundColor(0);
            webView.setWebViewClient(messageFullScreen.p());
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setDefaultTextEncodingName("UTF-8");
            return webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MessageFullScreen messageFullScreen = this.d;
            try {
                WebView webViewA = a();
                messageFullScreen.t = webViewA;
                webViewA.loadDataWithBaseURL("file:///android_asset/", messageFullScreen.s, "text/html", "UTF-8", null);
                ViewGroup viewGroup = messageFullScreen.v;
                if (viewGroup == null) {
                    StaticMethods.J("Messages - unable to get root view group from os", new Object[0]);
                    messageFullScreen.u.finish();
                    messageFullScreen.u.overridePendingTransition(0, 0);
                    messageFullScreen.f = false;
                    return;
                }
                int measuredWidth = viewGroup.getMeasuredWidth();
                int measuredHeight = messageFullScreen.v.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    if (messageFullScreen.f) {
                        messageFullScreen.v.addView(messageFullScreen.t, measuredWidth, measuredHeight);
                    } else {
                        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, measuredHeight, BitmapDescriptorFactory.HUE_RED);
                        translateAnimation.setDuration(300L);
                        messageFullScreen.t.setAnimation(translateAnimation);
                        messageFullScreen.v.addView(messageFullScreen.t, measuredWidth, measuredHeight);
                    }
                    messageFullScreen.f = true;
                    return;
                }
                StaticMethods.J("Messages - root view hasn't been measured, cannot show message", new Object[0]);
                messageFullScreen.u.finish();
                messageFullScreen.u.overridePendingTransition(0, 0);
                messageFullScreen.f = false;
            } catch (Exception e) {
                StaticMethods.I("Messages - Failed to show full screen message (%s)", e.getMessage());
            }
        }
    }

    public static class MessageFullScreenWebViewClient extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final MessageFullScreen f13269a;

        public MessageFullScreenWebViewClient(MessageFullScreen messageFullScreen) {
            this.f13269a = messageFullScreen;
        }

        public final void a(WebView webView) {
            MessageFullScreen messageFullScreen = this.f13269a;
            if (messageFullScreen.v == null) {
                StaticMethods.J("Messages - unable to get root view group from os", new Object[0]);
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, messageFullScreen.v.getMeasuredHeight());
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.adobe.mobile.MessageFullScreen.MessageFullScreenWebViewClient.1
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    MessageFullScreen messageFullScreen2 = MessageFullScreenWebViewClient.this.f13269a;
                    messageFullScreen2.u.finish();
                    messageFullScreen2.u.overridePendingTransition(0, 0);
                    messageFullScreen2.f = false;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }
            });
            webView.setAnimation(translateAnimation);
            messageFullScreen.v.removeView(webView);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) throws UnsupportedEncodingException {
            String strSubstring;
            if (str.startsWith("adbinapp")) {
                boolean zContains = str.contains("cancel");
                MessageFullScreen messageFullScreen = this.f13269a;
                if (zContains) {
                    if (messageFullScreen.w) {
                        messageFullScreen.o();
                    }
                    a(webView);
                    return true;
                }
                if (str.contains("confirm")) {
                    if (messageFullScreen.w) {
                        messageFullScreen.c();
                    }
                    a(webView);
                    int iIndexOf = str.indexOf("url=");
                    if (iIndexOf >= 0 && (strSubstring = str.substring(iIndexOf + 4)) != null && !strSubstring.isEmpty()) {
                        HashMap mapB = messageFullScreen.b(Message.e(strSubstring), true);
                        mapB.put("{userId}", "0");
                        mapB.put("{trackingId}", "0");
                        mapB.put("{messageId}", messageFullScreen.f13268a);
                        mapB.put("{lifetimeValue}", AnalyticsTrackLifetimeValueIncrease.a().toString());
                        if (MobileConfig.b().l == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN) {
                            mapB.put("{userId}", StaticMethods.F() == null ? "" : StaticMethods.F());
                            mapB.put("{trackingId}", StaticMethods.g() != null ? StaticMethods.g() : "");
                        }
                        String strF = StaticMethods.f(strSubstring, mapB);
                        if (strF != null && !strF.isEmpty()) {
                            try {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(strF));
                                messageFullScreen.u.startActivity(intent);
                                return true;
                            } catch (Exception e) {
                                StaticMethods.I("Messages - unable to launch intent from full screen message (%s)", e.getMessage());
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @Override // com.adobe.mobile.Message
    public final boolean f(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() <= 0 || !super.f(jSONObject)) {
            return false;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            if (jSONObject2.length() <= 0) {
                StaticMethods.I("Messages - Unable to create fullscreen message \"%s\", payload is empty", this.f13268a);
                return false;
            }
            try {
                String string = jSONObject2.getString("html");
                this.r = string;
                if (string.length() <= 0) {
                    StaticMethods.I("Messages - Unable to create fullscreen message \"%s\", html is empty", this.f13268a);
                    return false;
                }
                try {
                    JSONArray jSONArray = jSONObject2.getJSONArray("assets");
                    if (jSONArray == null || jSONArray.length() <= 0) {
                        return true;
                    }
                    this.h = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        if (jSONArray2 != null && jSONArray2.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                arrayList.add(jSONArray2.getString(i2));
                            }
                            this.h.add(arrayList);
                        }
                    }
                    return true;
                } catch (JSONException unused) {
                    StaticMethods.I("Messages - No assets found for fullscreen message \"%s\"", this.f13268a);
                    return true;
                }
            } catch (JSONException unused2) {
                StaticMethods.I("Messages - Unable to create fullscreen message \"%s\", html is required", this.f13268a);
                return false;
            }
        } catch (JSONException unused3) {
            StaticMethods.I("Messages - Unable to create fullscreen message \"%s\", payload is required", this.f13268a);
            return false;
        }
    }

    @Override // com.adobe.mobile.Message
    public void n() {
        String string;
        try {
            Activity activityQ = StaticMethods.q();
            super.n();
            if (this.w) {
                j();
            }
            synchronized (Messages.b) {
                Messages.f13272a = this;
            }
            HashMap map = new HashMap();
            ArrayList arrayList = this.h;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = (ArrayList) it.next();
                    int size = arrayList2.size();
                    if (size > 0) {
                        String str = (String) arrayList2.get(0);
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                string = null;
                                break;
                            }
                            File fileE = RemoteDownload.e((String) it2.next(), "messageImages");
                            if (fileE != null) {
                                string = fileE.toURI().toString();
                                break;
                            }
                        }
                        if (string == null) {
                            String str2 = (String) arrayList2.get(size - 1);
                            if (str2 == null || str2.length() <= 0) {
                                string = str2;
                            } else {
                                try {
                                    new URL(str2);
                                } catch (MalformedURLException unused) {
                                }
                            }
                        }
                        if (string != null) {
                            map.put(str, string);
                        }
                    }
                }
            }
            this.s = StaticMethods.f(this.r, map);
            try {
                Intent intent = new Intent(activityQ.getApplicationContext(), (Class<?>) MessageFullScreenActivity.class);
                intent.addFlags(65536);
                activityQ.startActivity(intent);
                activityQ.overridePendingTransition(0, 0);
            } catch (ActivityNotFoundException e) {
                StaticMethods.K("Messages - Must declare MessageFullScreenActivity in AndroidManifest.xml in order to show full screen messages (%s)", e.getMessage());
            }
        } catch (StaticMethods.NullActivityException e2) {
            StaticMethods.J(e2.getMessage(), new Object[0]);
        }
    }

    public MessageFullScreenWebViewClient p() {
        return new MessageFullScreenWebViewClient(this);
    }

    public MessageFullScreenRunner q(MessageFullScreen messageFullScreen) {
        return new MessageFullScreenRunner(messageFullScreen);
    }
}

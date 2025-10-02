package com.tealium.tagmanagementdispatcher;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tealium.core.Logger;

/* loaded from: classes.dex */
public final class b extends WebChromeClient {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19208a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 1;
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 2;
            iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 5;
            f19208a = iArr;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            String strSourceId = consoleMessage.sourceId();
            int iLineNumber = consoleMessage.lineNumber();
            String strMessage = consoleMessage.message();
            StringBuilder sbU = androidx.camera.core.impl.b.u("Src: ", iLineNumber, strSourceId, "; Line: ", "; ");
            sbU.append(strMessage);
            String string = sbU.toString();
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            int i = messageLevel == null ? -1 : a.f19208a[messageLevel.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", string);
                    return true;
                }
                if (i == 3) {
                    Logger.f19124a.h("Tealium-TagManagementDispatcher-1.2.2", string);
                    return true;
                }
                if (i == 4) {
                    Logger.f19124a.h("Tealium-TagManagementDispatcher-1.2.2", string);
                    return true;
                }
                if (i != 5) {
                    Logger.Companion companion = Logger.f19124a;
                    Logger.Companion.c("Tealium-TagManagementDispatcher-1.2.2", string);
                    return true;
                }
                Logger.Companion companion2 = Logger.f19124a;
                Logger.Companion.c("Tealium-TagManagementDispatcher-1.2.2", string);
                return true;
            }
            Logger.f19124a.b("Tealium-TagManagementDispatcher-1.2.2", string);
        }
        return true;
    }
}

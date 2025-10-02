package androidx.credentials.provider.utils;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.content.pm.SigningInfo;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.Action;
import androidx.credentials.provider.AuthenticationAction;
import androidx.credentials.provider.BeginGetCredentialOption;
import androidx.credentials.provider.BeginGetCredentialRequest;
import androidx.credentials.provider.BeginGetCustomCredentialOption;
import androidx.credentials.provider.BeginGetPasswordOption;
import androidx.credentials.provider.BeginGetPublicKeyCredentialOption;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CredentialEntry;
import androidx.credentials.provider.CustomCredentialEntry;
import androidx.credentials.provider.PasswordCredentialEntry;
import androidx.credentials.provider.PublicKeyCredentialEntry;
import androidx.credentials.provider.RemoteEntry;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil;", "", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class BeginGetCredentialUtil {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static BeginGetCredentialResponse a(androidx.credentials.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
            Iterator it;
            Slice sliceBuild;
            String str;
            String str2;
            String str3;
            androidx.credentials.provider.BeginGetCredentialResponse response = beginGetCredentialResponse;
            Intrinsics.h(response, "response");
            BeginGetCredentialResponse.Builder builderL = a.l();
            Iterator it2 = response.f2533a.iterator();
            while (it2.hasNext()) {
                CredentialEntry entry = (CredentialEntry) it2.next();
                Intrinsics.h(entry, "entry");
                if (entry instanceof PasswordCredentialEntry) {
                    PasswordCredentialEntry passwordCredentialEntry = (PasswordCredentialEntry) entry;
                    String str4 = passwordCredentialEntry.f2536a;
                    it = it2;
                    CharSequence charSequence = passwordCredentialEntry.c;
                    CharSequence charSequence2 = passwordCredentialEntry.d;
                    PendingIntent pendingIntent = passwordCredentialEntry.f;
                    CharSequence charSequence3 = passwordCredentialEntry.e;
                    Instant instant = passwordCredentialEntry.g;
                    Icon icon = passwordCredentialEntry.h;
                    boolean z = passwordCredentialEntry.i;
                    BeginGetCredentialOption beginGetCredentialOption = passwordCredentialEntry.b;
                    Slice.Builder builderAddIcon = new Slice.Builder(Uri.EMPTY, new SliceSpec(str4, 1)).addText(charSequence3, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(charSequence, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(charSequence2, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(z ? "true" : "false", null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption.f2531a, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
                    try {
                        if (icon.getResId() == 2131231505) {
                            builderAddIcon.addInt(1, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    if (beginGetCredentialOption.c.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED")) {
                        str3 = null;
                        builderAddIcon.addInt(1, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
                    } else {
                        str3 = null;
                    }
                    if (instant != null) {
                        builderAddIcon.addLong(instant.toEpochMilli(), str3, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
                    }
                    builderAddIcon.addAction(pendingIntent, new Slice.Builder(builderAddIcon).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), str3);
                    sliceBuild = builderAddIcon.build();
                    Intrinsics.g(sliceBuild, "sliceBuilder.build()");
                } else {
                    it = it2;
                    if (entry instanceof PublicKeyCredentialEntry) {
                        PublicKeyCredentialEntry publicKeyCredentialEntry = (PublicKeyCredentialEntry) entry;
                        String str5 = publicKeyCredentialEntry.f2536a;
                        CharSequence charSequence4 = publicKeyCredentialEntry.c;
                        CharSequence charSequence5 = publicKeyCredentialEntry.d;
                        PendingIntent pendingIntent2 = publicKeyCredentialEntry.f;
                        CharSequence charSequence6 = publicKeyCredentialEntry.e;
                        Instant instant2 = publicKeyCredentialEntry.h;
                        Icon icon2 = publicKeyCredentialEntry.g;
                        boolean z2 = publicKeyCredentialEntry.i;
                        BeginGetCredentialOption beginGetCredentialOption2 = publicKeyCredentialEntry.b;
                        Slice.Builder builderAddIcon2 = new Slice.Builder(Uri.EMPTY, new SliceSpec(str5, 1)).addText(charSequence6, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(charSequence4, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(charSequence5, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(z2 ? "true" : "false", null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption2.f2531a, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon2, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
                        try {
                            if (icon2.getResId() == 2131231504) {
                                builderAddIcon2.addInt(1, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        if (beginGetCredentialOption2.c.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED")) {
                            str2 = null;
                            builderAddIcon2.addInt(1, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
                        } else {
                            str2 = null;
                        }
                        if (instant2 != null) {
                            builderAddIcon2.addLong(instant2.toEpochMilli(), str2, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
                        }
                        builderAddIcon2.addAction(pendingIntent2, new Slice.Builder(builderAddIcon2).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), str2);
                        sliceBuild = builderAddIcon2.build();
                        Intrinsics.g(sliceBuild, "sliceBuilder.build()");
                    } else if (entry instanceof CustomCredentialEntry) {
                        CustomCredentialEntry customCredentialEntry = (CustomCredentialEntry) entry;
                        String str6 = customCredentialEntry.c;
                        CharSequence charSequence7 = customCredentialEntry.d;
                        CharSequence charSequence8 = customCredentialEntry.g;
                        PendingIntent pendingIntent3 = customCredentialEntry.e;
                        CharSequence charSequence9 = customCredentialEntry.h;
                        Instant instant3 = customCredentialEntry.j;
                        Icon icon3 = customCredentialEntry.i;
                        boolean z3 = customCredentialEntry.f;
                        BeginGetCredentialOption beginGetCredentialOption3 = customCredentialEntry.b;
                        Slice.Builder builderAddIcon3 = new Slice.Builder(Uri.EMPTY, new SliceSpec(str6, 1)).addText(charSequence9, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(charSequence7, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(charSequence8, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(z3 ? "true" : "false", null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption3.f2531a, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon3, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON"));
                        try {
                            if (icon3.getResId() == 2131231499) {
                                builderAddIcon3.addInt(1, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        if (beginGetCredentialOption3.c.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED")) {
                            str = null;
                            builderAddIcon3.addInt(1, null, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
                        } else {
                            str = null;
                        }
                        if (instant3 != null) {
                            builderAddIcon3.addLong(instant3.toEpochMilli(), str, CollectionsKt.Q("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
                        }
                        builderAddIcon3.addAction(pendingIntent3, new Slice.Builder(builderAddIcon3).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), str);
                        sliceBuild = builderAddIcon3.build();
                        Intrinsics.g(sliceBuild, "sliceBuilder.build()");
                    } else {
                        sliceBuild = null;
                    }
                }
                if (sliceBuild != null) {
                    a.A();
                    a.s();
                    String str7 = entry.b.f2531a;
                    String c = entry.getC();
                    Bundle bundle = Bundle.EMPTY;
                    builderL.addCredentialEntry(a.p(a.h(str7, c), sliceBuild));
                }
                response = beginGetCredentialResponse;
                it2 = it;
            }
            for (Action action : response.b) {
                a.y();
                Intrinsics.h(action, "action");
                CharSequence charSequence10 = action.f2527a;
                CharSequence charSequence11 = action.c;
                PendingIntent pendingIntent4 = action.b;
                Slice.Builder builderAddText = new Slice.Builder(Uri.EMPTY, new SliceSpec("Action", 0)).addText(charSequence10, null, CollectionsKt.Q("androidx.credentials.provider.action.HINT_ACTION_TITLE")).addText(charSequence11, null, CollectionsKt.Q("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT"));
                builderAddText.addAction(pendingIntent4, new Slice.Builder(builderAddText).addHints(Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")).build(), null);
                Slice sliceBuild2 = builderAddText.build();
                Intrinsics.g(sliceBuild2, "sliceBuilder.build()");
                builderL.addAction(a.d(sliceBuild2));
            }
            for (AuthenticationAction authenticationAction : response.c) {
                a.y();
                Intrinsics.h(authenticationAction, "authenticationAction");
                CharSequence charSequence12 = authenticationAction.f2528a;
                PendingIntent pendingIntent5 = authenticationAction.b;
                Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("AuthenticationAction", 0));
                builder.addAction(pendingIntent5, new Slice.Builder(builder).addHints(Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")).build(), null).addText(charSequence12, null, CollectionsKt.Q("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE"));
                Slice sliceBuild3 = builder.build();
                Intrinsics.g(sliceBuild3, "sliceBuilder.build()");
                builderL.addAuthenticationAction(a.d(sliceBuild3));
            }
            RemoteEntry remoteEntry = response.d;
            if (remoteEntry != null) {
                androidx.credentials.a.D();
                builderL.setRemoteCredentialEntry(androidx.credentials.a.o(RemoteEntry.Companion.b(remoteEntry)));
            }
            BeginGetCredentialResponse beginGetCredentialResponseBuild = builderL.build();
            Intrinsics.g(beginGetCredentialResponseBuild, "frameworkBuilder.build()");
            return beginGetCredentialResponseBuild;
        }

        public static BeginGetCredentialRequest b(android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest) throws FrameworkClassParsingException {
            CallingAppInfo callingAppInfo;
            BeginGetCredentialOption beginGetPublicKeyCredentialOption;
            BeginGetCredentialOption beginGetCredentialOptionA;
            ArrayList arrayList = new ArrayList();
            List beginGetCredentialOptions = beginGetCredentialRequest.getBeginGetCredentialOptions();
            Intrinsics.g(beginGetCredentialOptions, "request.beginGetCredentialOptions");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                android.service.credentials.BeginGetCredentialOption beginGetCredentialOptionG = a.g(it.next());
                String id = beginGetCredentialOptionG.getId();
                Intrinsics.g(id, "it.id");
                String type = beginGetCredentialOptionG.getType();
                Intrinsics.g(type, "it.type");
                Bundle candidateQueryData = beginGetCredentialOptionG.getCandidateQueryData();
                Intrinsics.g(candidateQueryData, "it.candidateQueryData");
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    beginGetCredentialOptionA = BeginGetPasswordOption.Companion.a(candidateQueryData, id);
                } else {
                    if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = candidateQueryData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            candidateQueryData.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                            Intrinsics.e(string);
                            beginGetPublicKeyCredentialOption = new BeginGetPublicKeyCredentialOption(candidateQueryData, id, string);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    } else {
                        beginGetPublicKeyCredentialOption = new BeginGetCustomCredentialOption(id, type, candidateQueryData);
                    }
                    beginGetCredentialOptionA = beginGetPublicKeyCredentialOption;
                }
                arrayList.add(beginGetCredentialOptionA);
            }
            android.service.credentials.CallingAppInfo callingAppInfo2 = beginGetCredentialRequest.getCallingAppInfo();
            if (callingAppInfo2 != null) {
                String packageName = callingAppInfo2.getPackageName();
                Intrinsics.g(packageName, "it.packageName");
                SigningInfo signingInfo = callingAppInfo2.getSigningInfo();
                Intrinsics.g(signingInfo, "it.signingInfo");
                callingAppInfo = new CallingAppInfo(packageName, signingInfo, callingAppInfo2.getOrigin());
            } else {
                callingAppInfo = null;
            }
            return new BeginGetCredentialRequest(arrayList, callingAppInfo);
        }
    }
}

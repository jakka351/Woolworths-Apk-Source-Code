package com.tealium.remotecommands.branch;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.snapshots.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.storage.db.h;
import com.tealium.remotecommands.RemoteCommandContext;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.BranchError;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.ContentMetadata;
import io.branch.referral.util.CurrencyType;
import io.branch.referral.util.ProductCategory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/remotecommands/branch/BranchInstance;", "Lcom/tealium/remotecommands/branch/BranchCommand;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "branch_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BranchInstance implements BranchCommand, Application.ActivityLifecycleCallbacks {
    public final Application d;
    public String e;
    public final RemoteCommandContext f;
    public Activity g;
    public final a h;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19203a = new int[BRANCH_STANDARD_EVENT.values().length];
    }

    public BranchInstance(Application application, String str, RemoteCommandContext remoteCommandContext) {
        Intrinsics.h(application, "application");
        this.d = application;
        this.e = str;
        this.f = remoteCommandContext;
        this.h = new a(this, 12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static void a(BranchUniversalObject branchUniversalObject, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                String string = objOpt.toString();
                if (next != null) {
                    switch (next.hashCode()) {
                        case -1863680812:
                            if (!next.equals("canonical_identifier")) {
                                break;
                            } else {
                                branchUniversalObject.c(string);
                                break;
                            }
                        case -1724546052:
                            if (!next.equals(lqlqqlq.mmm006Dm006Dm)) {
                                break;
                            } else {
                                branchUniversalObject.e(string);
                                break;
                            }
                        case -877823861:
                            if (!next.equals("image_url")) {
                                break;
                            } else {
                                branchUniversalObject.f(string);
                                break;
                            }
                        case 110371416:
                            if (!next.equals("title")) {
                                break;
                            } else {
                                branchUniversalObject.h(string);
                                break;
                            }
                        case 2122907556:
                            if (!next.equals("canonical_url")) {
                                break;
                            } else {
                                branchUniversalObject.d(string);
                                break;
                            }
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(ContentMetadata contentMetadata, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                String string = objOpt.toString();
                if (next != null) {
                    switch (next.hashCode()) {
                        case -2001122949:
                            if (!next.equals("rating_average")) {
                                break;
                            } else {
                                contentMetadata.o = Double.valueOf(Double.parseDouble(string));
                                break;
                            }
                        case -1617812171:
                            if (!next.equals("product_variant")) {
                                break;
                            } else {
                                contentMetadata.m = string;
                                break;
                            }
                        case -1607451058:
                            if (!next.equals("product_category")) {
                                break;
                            } else {
                                ProductCategory productCategoryA = ProductCategory.a(string);
                                if (productCategoryA == null) {
                                    contentMetadata.a("productCategory", string);
                                    break;
                                } else {
                                    contentMetadata.k = productCategoryA;
                                    break;
                                }
                            }
                        case -1439978388:
                            if (!next.equals(h.a.b)) {
                                break;
                            } else {
                                contentMetadata.w = Double.valueOf(Double.parseDouble(string));
                                break;
                            }
                        case -1285004149:
                            if (!next.equals("quantity")) {
                                break;
                            } else {
                                contentMetadata.d(Double.valueOf(Double.parseDouble(string)));
                                break;
                            }
                        case -1163041205:
                            if (!next.equals("address_country")) {
                                break;
                            } else {
                                contentMetadata.u = string;
                                break;
                            }
                        case -938102371:
                            if (!next.equals("rating")) {
                                break;
                            } else {
                                contentMetadata.n = Double.valueOf(Double.parseDouble(string));
                                break;
                            }
                        case -861311717:
                            if (!next.equals("condition")) {
                                break;
                            } else {
                                ContentMetadata.CONDITION conditionA = ContentMetadata.CONDITION.a(string);
                                if (conditionA == null) {
                                    contentMetadata.a("condition", string);
                                    break;
                                } else {
                                    contentMetadata.l = conditionA;
                                    break;
                                }
                            }
                        case -331154451:
                            if (!next.equals("rating_count")) {
                                break;
                            } else {
                                contentMetadata.p = Integer.valueOf(Integer.parseInt(string));
                                break;
                            }
                        case 113949:
                            if (!next.equals("sku")) {
                                break;
                            } else {
                                contentMetadata.h = string;
                                break;
                            }
                        case 106934601:
                            if (!next.equals("price")) {
                                break;
                            } else {
                                contentMetadata.f = Double.valueOf(Double.parseDouble(string));
                                break;
                            }
                        case 137365935:
                            if (!next.equals(h.a.c)) {
                                break;
                            } else {
                                contentMetadata.x = Double.valueOf(Double.parseDouble(string));
                                break;
                            }
                        case 263786198:
                            if (!next.equals("address_city")) {
                                break;
                            } else {
                                contentMetadata.s = string;
                                break;
                            }
                        case 460545302:
                            if (!next.equals("address_postal_code")) {
                                break;
                            } else {
                                contentMetadata.v = string;
                                break;
                            }
                        case 520809887:
                            if (!next.equals("address_region")) {
                                break;
                            } else {
                                contentMetadata.t = string;
                                break;
                            }
                        case 563615406:
                            if (!next.equals("address_street")) {
                                break;
                            } else {
                                contentMetadata.r = string;
                                break;
                            }
                        case 1014375387:
                            if (!next.equals("product_name")) {
                                break;
                            } else {
                                contentMetadata.i = string;
                                break;
                            }
                        case 1109244584:
                            if (!next.equals("currency_type")) {
                                break;
                            } else {
                                CurrencyType currencyTypeA = CurrencyType.a(string);
                                if (currencyTypeA == null) {
                                    contentMetadata.a("currencyType", string);
                                    break;
                                } else {
                                    contentMetadata.g = currencyTypeA;
                                    break;
                                }
                            }
                        case 1370278967:
                            if (!next.equals("product_brand")) {
                                break;
                            } else {
                                contentMetadata.j = string;
                                break;
                            }
                        case 1735885233:
                            if (!next.equals("image_captions")) {
                                break;
                            } else {
                                contentMetadata.b(string);
                                break;
                            }
                        case 2091282370:
                            if (!next.equals("rating_max")) {
                                break;
                            } else {
                                contentMetadata.q = Double.valueOf(Double.parseDouble(string));
                                break;
                            }
                    }
                }
                contentMetadata.a(next, string);
            }
        }
    }

    public static LinkedHashMap d(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.g(itKeys, "keys()");
        Sequence sequenceB = SequencesKt.b(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator f24664a = ((ConstrainedOnceSequence) sequenceB).getF24664a();
        while (f24664a.hasNext()) {
            Object next = f24664a.next();
            Object objD = jSONObject.get((String) next);
            if (objD instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objD;
                IntRange intRangeO = RangesKt.o(0, jSONArray.length());
                int iH = MapsKt.h(CollectionsKt.s(intRangeO, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH);
                IntProgressionIterator it = intRangeO.iterator();
                while (it.f) {
                    int iNextInt = it.nextInt();
                    linkedHashMap2.put(String.valueOf(iNextInt), jSONArray.get(iNextInt));
                }
                objD = CollectionsKt.G0(d(new JSONObject(linkedHashMap2)).values());
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            } else if (Intrinsics.c(objD, JSONObject.NULL)) {
                objD = null;
            }
            linkedHashMap.put(next, objD);
        }
        return linkedHashMap;
    }

    @Override // io.branch.referral.Branch.BranchReferralInitListener
    public final void b(JSONObject jSONObject, BranchError branchError) {
        this.f.a("branch_referring_params", jSONObject != null ? d(jSONObject) : null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.h(activity, "activity");
        this.g = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.h(activity, "activity");
        this.g = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.h(activity, "activity");
        Intrinsics.h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.h(activity, "activity");
        this.g = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.h(activity, "activity");
    }
}

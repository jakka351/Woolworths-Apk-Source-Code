package com.google.firebase.abt;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class FirebaseABTesting {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15176a;
    public Integer b = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface OriginService {
    }

    public FirebaseABTesting(Provider provider) {
        this.f15176a = provider;
    }

    public static boolean a(ArrayList arrayList, AbtExperimentInfo abtExperimentInfo) {
        String strC = abtExperimentInfo.c();
        String strD = abtExperimentInfo.d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.c().equals(strC) && abtExperimentInfo2.d().equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ArrayList arrayList) {
        Provider provider = this.f15176a;
        if (provider.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbtExperimentInfo.b((Map) it.next()));
        }
        if (arrayList2.isEmpty()) {
            if (provider.get() == null) {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            Iterator it2 = ((AnalyticsConnector) provider.get()).e().iterator();
            while (it2.hasNext()) {
                ((AnalyticsConnector) provider.get()).f(((AnalyticsConnector.ConditionalUserProperty) it2.next()).b);
            }
            return;
        }
        if (provider.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayListE = ((AnalyticsConnector) provider.get()).e();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListE.iterator();
        while (it3.hasNext()) {
            arrayList3.add(AbtExperimentInfo.a((AnalyticsConnector.ConditionalUserProperty) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it4.next();
            if (!a(arrayList2, abtExperimentInfo)) {
                arrayList4.add(abtExperimentInfo.e());
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((AnalyticsConnector) provider.get()).f(((AnalyticsConnector.ConditionalUserProperty) it5.next()).b);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it6.next();
            if (!a(arrayList3, abtExperimentInfo2)) {
                arrayList5.add(abtExperimentInfo2);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(((AnalyticsConnector) provider.get()).e());
        if (this.b == null) {
            this.b = Integer.valueOf(((AnalyticsConnector) provider.get()).h());
        }
        int iIntValue = this.b.intValue();
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            AbtExperimentInfo abtExperimentInfo3 = (AbtExperimentInfo) it7.next();
            while (arrayDeque.size() >= iIntValue) {
                ((AnalyticsConnector) provider.get()).f(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).b);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserPropertyE = abtExperimentInfo3.e();
            ((AnalyticsConnector) provider.get()).d(conditionalUserPropertyE);
            arrayDeque.offer(conditionalUserPropertyE);
        }
    }
}

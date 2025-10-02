package com.dynatrace.android.agent.events.eventsapi;

import java.util.Objects;

/* loaded from: classes4.dex */
public class EnrichmentAttribute implements Comparable<EnrichmentAttribute> {

    /* renamed from: com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute$1, reason: invalid class name */
    public class AnonymousClass1 implements OverridingStrategy {
    }

    /* renamed from: com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute$2, reason: invalid class name */
    public class AnonymousClass2 implements OverridingStrategy {
    }

    @Override // java.lang.Comparable
    public final int compareTo(EnrichmentAttribute enrichmentAttribute) {
        enrichmentAttribute.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(null, null, null, Boolean.FALSE);
    }

    public final String toString() {
        return "EnrichmentAttribute{key='null', value=null, overridingStrategy=null, addToOverridableKeys=false}";
    }
}

package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.v1.GaugeMetric;

/* loaded from: classes6.dex */
final class FirebasePerfGaugeMetricValidator extends PerfMetricValidator {
    public final GaugeMetric b;

    public FirebasePerfGaugeMetricValidator(GaugeMetric gaugeMetric) {
        this.b = gaugeMetric;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public final boolean b() {
        GaugeMetric gaugeMetric = this.b;
        if (!gaugeMetric.V()) {
            return false;
        }
        if (gaugeMetric.R() > 0 || gaugeMetric.Q() > 0) {
            return true;
        }
        return gaugeMetric.U() && gaugeMetric.T().P();
    }
}

package com.example.demo;

import java.security.Timestamp;

import javax.persistence.Embeddable;


@Embeddable
public class other_params {

	private String id;
	private Timestamp to;
	private Timestamp from;
	private Double  ava_hr;
	private Double ava_rr;
	private String device;
    private Long  hrv_hf;
    private Long  hrv_lf;
    private Long  max_hr;
    private Long  max_rr;
    private Long  min_hr;
    private Long  avg_act;
    private Long  checked;
    private String  fm_data;
    private Long  user_id;
    private Long  duration; 
    private Long  fm_count;
    private String  hrv_data;
    private String  calc_data;
    private Long  hrv_score;
    private Long  awakenings;
    private String  sleep_data;
    private Long  sleep_score;
    private String  bedexit_data;
    private Long  bedexit_count;
    private Long  duration_awake;
    private String  hrv_rmssd_data;
    private String  tossnturn_data;
    private Long  duration_in_bed;
    private Long  duration_in_rem;
    private Long  from_gmt_offset;
    private Long  tossnturn_count;
    private Long  bedexit_duration;
    private Long  duration_in_deep;
	private Long  duration_in_light;
    private Long  duration_in_sleep;
    private Double  hrv_rmssd_evening;
    private Double  hrv_rmssd_morning;
    private Long  duration_sleep_onset;
    
    public other_params() {
		super();
	}
    
	public other_params(String id, Timestamp to, Timestamp from, Double ava_hr, Double ava_rr, String device,
			Long hrv_hf, Long hrv_lf, Long max_hr, Long max_rr, Long min_hr, Long avg_act, Long checked, String fm_data,
			Long user_id, Long duration, Long fm_count, String hrv_data, String calc_data, Long hrv_score,
			Long awakenings, String sleep_data, Long sleep_score, String bedexit_data, Long bedexit_count,
			Long duration_awake, String hrv_rmssd_data, String tossnturn_data, Long duration_in_bed,
			Long duration_in_rem, Long from_gmt_offset, Long tossnturn_count, Long bedexit_duration,
			Long duration_in_deep, Long duration_in_light, Long duration_in_sleep, Double hrv_rmssd_evening,
			Double hrv_rmssd_morning, Long duration_sleep_onset) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.ava_hr = ava_hr;
		this.ava_rr = ava_rr;
		this.device = device;
		this.hrv_hf = hrv_hf;
		this.hrv_lf = hrv_lf;
		this.max_hr = max_hr;
		this.max_rr = max_rr;
		this.min_hr = min_hr;
		this.avg_act = avg_act;
		this.checked = checked;
		this.fm_data = fm_data;
		this.user_id = user_id;
		this.duration = duration;
		this.fm_count = fm_count;
		this.hrv_data = hrv_data;
		this.calc_data = calc_data;
		this.hrv_score = hrv_score;
		this.awakenings = awakenings;
		this.sleep_data = sleep_data;
		this.sleep_score = sleep_score;
		this.bedexit_data = bedexit_data;
		this.bedexit_count = bedexit_count;
		this.duration_awake = duration_awake;
		this.hrv_rmssd_data = hrv_rmssd_data;
		this.tossnturn_data = tossnturn_data;
		this.duration_in_bed = duration_in_bed;
		this.duration_in_rem = duration_in_rem;
		this.from_gmt_offset = from_gmt_offset;
		this.tossnturn_count = tossnturn_count;
		this.bedexit_duration = bedexit_duration;
		this.duration_in_deep = duration_in_deep;
		this.duration_in_light = duration_in_light;
		this.duration_in_sleep = duration_in_sleep;
		this.hrv_rmssd_evening = hrv_rmssd_evening;
		this.hrv_rmssd_morning = hrv_rmssd_morning;
		this.duration_sleep_onset = duration_sleep_onset;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getTo() {
		return to;
	}
	public void setTo(Timestamp to) {
		this.to = to;
	}
	public Timestamp getFrom() {
		return from;
	}
	public void setFrom(Timestamp from) {
		this.from = from;
	}
	public Double getAva_hr() {
		return ava_hr;
	}
	public void setAva_hr(Double ava_hr) {
		this.ava_hr = ava_hr;
	}
	public Double getAva_rr() {
		return ava_rr;
	}
	public void setAva_rr(Double ava_rr) {
		this.ava_rr = ava_rr;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public Long getHrv_hf() {
		return hrv_hf;
	}
	public void setHrv_hf(Long hrv_hf) {
		this.hrv_hf = hrv_hf;
	}
	public Long getHrv_lf() {
		return hrv_lf;
	}
	public void setHrv_lf(Long hrv_lf) {
		this.hrv_lf = hrv_lf;
	}
	public Long getMax_hr() {
		return max_hr;
	}
	public void setMax_hr(Long max_hr) {
		this.max_hr = max_hr;
	}
	public Long getMax_rr() {
		return max_rr;
	}
	public void setMax_rr(Long max_rr) {
		this.max_rr = max_rr;
	}
	public Long getMin_hr() {
		return min_hr;
	}
	public void setMin_hr(Long min_hr) {
		this.min_hr = min_hr;
	}
	public Long getAvg_act() {
		return avg_act;
	}
	public void setAvg_act(Long avg_act) {
		this.avg_act = avg_act;
	}
	public Long getChecked() {
		return checked;
	}
	public void setChecked(Long checked) {
		this.checked = checked;
	}
	public String getFm_data() {
		return fm_data;
	}
	public void setFm_data(String fm_data) {
		this.fm_data = fm_data;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getFm_count() {
		return fm_count;
	}
	public void setFm_count(Long fm_count) {
		this.fm_count = fm_count;
	}
	public String getHrv_data() {
		return hrv_data;
	}
	public void setHrv_data(String hrv_data) {
		this.hrv_data = hrv_data;
	}
	public String getCalc_data() {
		return calc_data;
	}
	public void setCalc_data(String calc_data) {
		this.calc_data = calc_data;
	}
	public Long getHrv_score() {
		return hrv_score;
	}
	public void setHrv_score(Long hrv_score) {
		this.hrv_score = hrv_score;
	}
	public Long getAwakenings() {
		return awakenings;
	}
	public void setAwakenings(Long awakenings) {
		this.awakenings = awakenings;
	}
	public String getSleep_data() {
		return sleep_data;
	}
	public void setSleep_data(String sleep_data) {
		this.sleep_data = sleep_data;
	}
	public Long getSleep_score() {
		return sleep_score;
	}
	public void setSleep_score(Long sleep_score) {
		this.sleep_score = sleep_score;
	}
	public String getBedexit_data() {
		return bedexit_data;
	}
	public void setBedexit_data(String bedexit_data) {
		this.bedexit_data = bedexit_data;
	}
	public Long getBedexit_count() {
		return bedexit_count;
	}
	public void setBedexit_count(Long bedexit_count) {
		this.bedexit_count = bedexit_count;
	}
	public Long getDuration_awake() {
		return duration_awake;
	}
	public void setDuration_awake(Long duration_awake) {
		this.duration_awake = duration_awake;
	}
	public String getHrv_rmssd_data() {
		return hrv_rmssd_data;
	}
	public void setHrv_rmssd_data(String hrv_rmssd_data) {
		this.hrv_rmssd_data = hrv_rmssd_data;
	}
	public String getTossnturn_data() {
		return tossnturn_data;
	}
	public void setTossnturn_data(String tossnturn_data) {
		this.tossnturn_data = tossnturn_data;
	}
	public Long getDuration_in_bed() {
		return duration_in_bed;
	}
	public void setDuration_in_bed(Long duration_in_bed) {
		this.duration_in_bed = duration_in_bed;
	}
	public Long getDuration_in_rem() {
		return duration_in_rem;
	}
	public void setDuration_in_rem(Long duration_in_rem) {
		this.duration_in_rem = duration_in_rem;
	}
	public Long getFrom_gmt_offset() {
		return from_gmt_offset;
	}
	public void setFrom_gmt_offset(Long from_gmt_offset) {
		this.from_gmt_offset = from_gmt_offset;
	}
	public Long getTossnturn_count() {
		return tossnturn_count;
	}
	public void setTossnturn_count(Long tossnturn_count) {
		this.tossnturn_count = tossnturn_count;
	}
	public Long getBedexit_duration() {
		return bedexit_duration;
	}
	public void setBedexit_duration(Long bedexit_duration) {
		this.bedexit_duration = bedexit_duration;
	}
	public Long getDuration_in_deep() {
		return duration_in_deep;
	}
	public void setDuration_in_deep(Long duration_in_deep) {
		this.duration_in_deep = duration_in_deep;
	}
	public Long getDuration_in_light() {
		return duration_in_light;
	}
	public void setDuration_in_light(Long duration_in_light) {
		this.duration_in_light = duration_in_light;
	}
	public Long getDuration_in_sleep() {
		return duration_in_sleep;
	}
	public void setDuration_in_sleep(Long duration_in_sleep) {
		this.duration_in_sleep = duration_in_sleep;
	}
	public Double getHrv_rmssd_evening() {
		return hrv_rmssd_evening;
	}
	public void setHrv_rmssd_evening(Double hrv_rmssd_evening) {
		this.hrv_rmssd_evening = hrv_rmssd_evening;
	}
	public Double getHrv_rmssd_morning() {
		return hrv_rmssd_morning;
	}
	public void setHrv_rmssd_morning(Double hrv_rmssd_morning) {
		this.hrv_rmssd_morning = hrv_rmssd_morning;
	}
	public Long getDuration_sleep_onset() {
		return duration_sleep_onset;
	}
	public void setDuration_sleep_onset(Long duration_sleep_onset) {
		this.duration_sleep_onset = duration_sleep_onset;
	}
    
    
    
    

}

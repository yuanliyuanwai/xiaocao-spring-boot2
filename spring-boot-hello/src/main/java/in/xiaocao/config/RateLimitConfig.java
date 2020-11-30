package in.xiaocao.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.xiaocao.dto.IPPolicy;
import in.xiaocao.dto.Policy;
import in.xiaocao.dto.UrlPolicy;

@Component
@ConfigurationProperties(prefix = "xiaocao.rate.limit")
public class RateLimitConfig {
	
	private Policy ipPolicy; // ip限流策略
	
	private List<IPPolicy> perIpPolicies; // 每个ip限流策略
	
	private Policy urlPolicy; // url限流策略
	
	private List<UrlPolicy> perUrlPolicies; // 每个url限流策略
	

	public Policy getIpPolicy() {
		return ipPolicy;
	}

	public void setIpPolicy(Policy ipPolicy) {
		this.ipPolicy = ipPolicy;
	}

	public List<IPPolicy> getPerIpPolicies() {
		return perIpPolicies;
	}

	public void setPerIpPolicies(List<IPPolicy> perIpPolicies) {
		this.perIpPolicies = perIpPolicies;
	}

	public Policy getUrlPolicy() {
		return urlPolicy;
	}

	public void setUrlPolicy(Policy urlPolicy) {
		this.urlPolicy = urlPolicy;
	}

	public List<UrlPolicy> getPerUrlPolicies() {
		return perUrlPolicies;
	}

	public void setPerUrlPolicies(List<UrlPolicy> perUrlPolicies) {
		this.perUrlPolicies = perUrlPolicies;
	}
	
}

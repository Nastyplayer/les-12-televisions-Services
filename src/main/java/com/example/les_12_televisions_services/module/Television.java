package com.example.les_12_televisions_services.module;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.*;

import java.util.List;


@Entity
      //  @Table(name = "televisions")
        public class Television {
        @Id
        @GeneratedValue

        private Long id;
        private String type;
        private String brand;

        private String name;
        private Double price;
        private Double availableSize;
        private Double refreshRate;
        private String screenType;
        private String screenQuality;
        private Boolean smartTv;
        private Boolean wifi;
        private Boolean voiceControl;
        private Boolean hdr;
        private Boolean bluetooth;
        private Boolean ambiLight;

        private Integer originalStock;

        private Integer sold;

@OneToOne

        private RemoteController remoteController;

@ManyToMany
@JoinTable(name = "between_table",
joinColumns = @JoinColumn(name = "tv_id"),
inverseJoinColumns = @JoinColumn(name = "wb_id"))
private List<WallBracket> wallBrackets;



@OneToMany(mappedBy = "television")
private List<TelevisionsWallBrackets>televisionsWallBrackets;


@OneToMany(mappedBy = "television")
private List<TelevisionsCiModules>televisionsCiModules;

        public List<TelevisionsCiModules> getTelevisionsCiModules() {
                return televisionsCiModules;
        }

        public void setTelevisionsCiModules(List<TelevisionsCiModules> televisionsCiModules) {
                this.televisionsCiModules = televisionsCiModules;
        }

        public static void set(long id, String television) {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public Double getAvailableSize() {
                return availableSize;
        }

        public void setAvailableSize(Double availableSize) {
                this.availableSize = availableSize;
        }

        public Double getRefreshRate() {
                return refreshRate;
        }

        public void setRefreshRate(Double refreshRate) {
                this.refreshRate = refreshRate;
        }

        public String getScreenType() {
                return screenType;
        }

        public void setScreenType(String screenType) {
                this.screenType = screenType;
        }

        public String getScreenQuality() {
                return screenQuality;
        }

        public void setScreenQuality(String screenQuality) {
                this.screenQuality = screenQuality;
        }

        public Boolean getSmartTv() {
                return smartTv;
        }

        public void setSmartTv(Boolean smartTv) {
                this.smartTv = smartTv;
        }

        public Boolean getWifi() {
                return wifi;
        }

        public void setWifi(Boolean wifi) {
                this.wifi = wifi;
        }

        public Boolean getVoiceControl() {
                return voiceControl;
        }

        public void setVoiceControl(Boolean voiceControl) {
                this.voiceControl = voiceControl;
        }

        public Boolean getHdr() {
                return hdr;
        }

        public void setHdr(Boolean hdr) {
                this.hdr = hdr;
        }

        public Boolean getBluetooth() {
                return bluetooth;
        }

        public void setBluetooth(Boolean bluetooth) {
                this.bluetooth = bluetooth;
        }

        public Boolean getAmbiLight() {
                return ambiLight;
        }

        public void setAmbiLight(Boolean ambiLight) {
                this.ambiLight = ambiLight;
        }

        public Integer getOriginalStock() {
                return originalStock;
        }

        public void setOriginalStock(Integer originalStock) {
                this.originalStock = originalStock;
        }

        public Integer getSold() {
                return sold;
        }

        public void setSold(Integer sold) {
                this.sold = sold;
        }

        public RemoteController getRemoteController() {
                return remoteController;
        }

        public void setRemoteController(RemoteController remoteController) {
                this.remoteController = remoteController;
        }

        public List<WallBracket> getWallBrackets() {
                return wallBrackets;
        }

        public void setWallBrackets(List<WallBracket> wallBrackets) {
                this.wallBrackets = wallBrackets;
        }

        public List<TelevisionsWallBrackets> getTelevisionsWallBrackets() {
                return televisionsWallBrackets;
        }

        public void setTelevisionsWallBrackets(List<TelevisionsWallBrackets> televisionsWallBrackets) {
                this.televisionsWallBrackets = televisionsWallBrackets;
        }
}







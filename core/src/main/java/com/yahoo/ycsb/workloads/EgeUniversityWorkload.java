
public class EgeUniversityWorkload extends Workload{

	public static final String dateFilePath="/home/oylum/YCSBWorkspace_2/date.csv";
	public static final String elevationFilePath="/home/oylum/YCSBWorkspace_2/elevation.csv";
	public static final String latitudeFilePath="/home/oylum/YCSBWorkspace_2/latitude.csv";
	public static final String longitudeFilePath="/home/oylum/YCSBWorkspace_2/longitude.csv";
	public static final String nameFilePath="/home/oylum/YCSBWorkspace_2/name.csv";
	public static final String prcpFilePath="/home/oylum/YCSBWorkspace_2/prcp.csv";
	public static final String recordFileFilePath="/home/oylum/YCSBWorkspace_2/recordFile.csv";
	public static final String snwdFilePath="/home/oylum/YCSBWorkspace_2/snwd.csv";
	public static final String stationFilePath="/home/oylum/YCSBWorkspace_2/station.csv";
	public static final String tavgFilePath="/home/oylum/YCSBWorkspace_2/tavg.csv";
	public static final String tmaxFilePath="/home/oylum/YCSBWorkspace_2/tmax.csv";
	public static final String tminFilePath="/home/oylum/YCSBWorkspace_2/tmin.csv";
	
	
	
	@Override
	public void init(Properties p) throws WorkloadException{
		FileGenerator dateGenerator=new FileGenerator(this.dateFilePath);
		FileGenerator elevationGenerator=new FileGenerator(this.elevationFilePath);
		FileGenerator latitudeGenerator=new FileGenerator(this.latitudeFilePath);
		FileGenerator longitudeGenerator=new FileGenerator(this.longitudeFilePath);
		FileGenerator nameGenerator=new FileGenerator(this.nameFilePath);
		FileGenerator prcpGenerator=new FileGenerator(this.prcpFilePath);
		FileGenerator recordFileGenerator=new FileGenerator(this.recordFileFilePath);
		FileGenerator snwdGenerator=new FileGenerator(this.snwdFilePath);
		FileGenerator stationGenerator=new FileGenerator(this.stationFilePath);
		FileGenerator tavgGenerator=new FileGenerator(this.tavgFilePath);
		FileGenerator tmaxGenerator=new FileGenerator(this.tmaxFilePath);
		FileGenerator tminGenerator=new FileGenerator(this.tminFilePath);
		
		
	}
}

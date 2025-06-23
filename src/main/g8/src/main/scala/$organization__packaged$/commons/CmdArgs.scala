package $organization$.commons

import org.rogach.scallop.{ScallopConf, ScallopOption}

class CmdArgs(arguments: Array[String]) extends ScallopConf(arguments) {

  val json: ScallopOption[String] =
    opt[String](
      name = "json",
      noshort = true,
      required = true,
      descr = "configuration json to provide the business configurations to run the job"
    )

  val appConf: ScallopOption[String] = opt[String](
    name = "app-conf",
    noshort = true,
    required = true,
    descr = "path to file containing hardware configurations for the job"
  )

  val jobId: ScallopOption[String] =
    opt[String]("jobId", 'j', required = true, descr = "Job ID of the Transformation Job")

  verify()

}